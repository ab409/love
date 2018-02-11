package me.ygy.love.service;

import com.google.common.collect.Maps;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import me.ygy.love.controller.api.NamePair;

/**
 * @author yuguangyuan
 */
@Component
public class NameTestCache {

  public Map<String, ConcurrentHashMap<NamePair, NamePair>> cookieMap = Maps.newConcurrentMap();

}
