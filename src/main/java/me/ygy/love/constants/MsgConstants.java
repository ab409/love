package me.ygy.love.constants;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import org.springframework.util.CollectionUtils;

import java.util.Map;
import java.util.Set;

import me.ygy.love.enums.NameTestResultEnum;

/**
 * @author yuguangyuan
 */
public class MsgConstants {

  public static Map<NameTestResultEnum, Set<String>> nameTestMsg = Maps.newHashMap();
  static {
    nameTestMsg.put(NameTestResultEnum.SUCCESS, Sets.newHashSet(
            "恭喜你，你们是真爱",
            "赶紧结婚，生孩子，生孩子的孩子"
    ));

    nameTestMsg.put(NameTestResultEnum.FIRST_FAIL, Sets.newHashSet(
            "分手吧",
            "分手吧，不是真爱",
            "赶紧分"
    ));

    nameTestMsg.put(NameTestResultEnum.SECOND_FAIL, Sets.newHashSet(
            "有病吧，刚试过了，赶紧分",
            "试了一次不信，还要第二次吗",
            "试了两次还不信，快分吧"
    ));

    nameTestMsg.put(NameTestResultEnum.MAN_YGY, Sets.newHashSet(
            "你的女神是杨景媛",
            "你已经找到真爱了，不用再测了"
    ));

    nameTestMsg.put(NameTestResultEnum.WOMEN_YJY, Sets.newHashSet(
            "你的守护者是于光远",
            "你已经找到真爱了，不用再测了"
    ));
  }
}
