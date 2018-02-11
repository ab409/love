package me.ygy.love.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;

import me.ygy.love.controller.api.NamePair;
import me.ygy.love.enums.NameTestResultEnum;

/**
 * @author yuguangyuan
 */
@Service
public class NameTestService {

  @Autowired
  private NameTestCache nameTestCache;

  public NameTestResultEnum testName(String sessionId, String man, String woman) {

    boolean isOldUser = nameTestCache.cookieMap.containsKey(sessionId);

    if ("于光远".equals(man) && "杨景媛".equals(woman)) {
      return NameTestResultEnum.SUCCESS;
    } else if ("于光远".equals(man)){
      return NameTestResultEnum.MAN_YGY;
    } else if ("杨景媛".equals(woman)) {
      return NameTestResultEnum.WOMEN_YJY;
    } else {
      NamePair pair = new NamePair(man, woman);
      if (isOldUser) {
        ConcurrentHashMap<NamePair, NamePair> namePairMap = nameTestCache.cookieMap.get(sessionId);
        if (namePairMap.contains(pair)) {
          return NameTestResultEnum.SECOND_FAIL;
        } else {

        }
      } else {

        return NameTestResultEnum.FIRST_FAIL;
      }
    }
  }
}
