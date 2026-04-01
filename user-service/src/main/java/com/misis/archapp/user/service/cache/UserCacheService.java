package com.misis.archapp.user.service.cache;

import com.misis.archapp.user.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserCacheService {

    private final RedisTemplate<String, Object> redisTemplate;
    private static final String CACHE_PREFIX = "user:v1:";
    private static final Duration TTL = Duration.ofSeconds(60);

    @Autowired
    public UserCacheService(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public Optional<UserDTO> getFromCache(UUID id) {
        return Optional.ofNullable((UserDTO) redisTemplate.opsForValue().get(CACHE_PREFIX + id));
    }

    public void saveToCache(UserDTO user) {
        redisTemplate.opsForValue().set(CACHE_PREFIX + user.id(), user, TTL);
    }

    public void removeFromCache(UUID id) {
        redisTemplate.delete(CACHE_PREFIX + id);
    }
}