package org.core.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConstantUtils {

    public static final String SYSTEMCONFIGMAP = "systemConfigMap"; // 系统配置redis的key


    public static final String ORDER_PAY_TYPE0 = "0"; // 微信
    public static final String ORDER_PAY_TYPE1 = "1"; // 支付宝

    public static final String AUDIT_STATUS101 = "101"; // 未审核
    public static final String AUDIT_STATUS102 = "102"; // 审核通过
    public static final String AUDIT_STATUS103 = "103"; // 审核驳回

    public static final String SHENNIUDATA_MOBILE = "shenniudata-mobile-"; // 忘记密码使用
    public static final String SHENNIUDATA_MOBILE_REGIS = "shenniudata-mobile-regis"; // 注册使用
    public static final String SHENNIUDATA_MOBILE_SUBMIT = "shenniudata-mobile-submit"; // 提现金额
    public static final String SHENNIUDATA_ADMIN_LOGIN = "shenniudata-admin-login"; // 登录

    public static final String ACCOUNT_TYPE101 = "101"; // 余额 HB
    public static final String ACCOUNT_TYPE102 = "102"; // 奖金 HC
    public static final String ACCOUNT_TYPE103 = "103"; // 通证 HMC
    public static final String ACCOUNT_TYPE104 = "104"; // 购物卷 HA
    public static final String ACCOUNT_TYPE105 = "105"; // 现金
    public static final String ACCOUNT_TYPE106 = "106"; // VIP

    public static final String SEND_USER_CODE10 = "10"; // 转增人
    public static final String SEND_USER_CODE20 = "20"; // 转增接收人

    public static final String OPERATION_TYPE10 = "10";  // 购买消费
    public static final String OPERATION_TYPE20 = "20";  // 提现
    public static final String OPERATION_TYPE30 = "30";  // 转增
    public static final String OPERATION_TYPE40 = "40"; // 充值
    public static final String OPERATION_TYPE50 = "50";  // 返现（红包）
    public static final String OPERATION_TYPE60 = "60";  // 购买未拼中退款
    public static final String OPERATION_TYPE70 = "70";  // 其他

    public static final String GROUP_TYPE0 = "0"; // 一镇一品
    public static final String GROUP_TYPE1 = "1"; // 随心拼
    public static final String GROUP_TYPE2 = "2"; // 无忧拼
    public static final String GROUP_TYPE3 = "3"; // 热门分享
    public static final String GROUP_TYPE4 = "4"; // 品牌特卖

    public static final String WITHDRAWAL_STATUS10 = "10"; // 提现中
    public static final String WITHDRAWAL_STATUS20 = "20"; // 提现失败
    public static final String WITHDRAWAL_STATUS30 = "30"; // 提现成功

    public static final String EXAMINE_STATUS10 = "10"; // 审核中
    public static final String EXAMINE_STATUS20 = "20"; // 审核驳回
    public static final String EXAMINE_STATUS30 = "30"; // 审核通过

    public static final String red_type10 = "10"; // 解锁红包
    public static final String red_type20 = "20"; // 普通红包

    public static final String GROUP_BOOKING_STATUS_FAIL = "101"; // 拼团失败
    public static final String GROUP_BOOKING_STATUS_MIDDLE = "102"; // 拼团中
    public static final String GROUP_BOOKING_STATUS_SUCCESS = "103"; // 拼团成功
    public static final String GROUP_BOOKING_STATUS_SUCCESS104 = "104"; // 已拼团待开奖(中奖)
    public static final String GROUP_BOOKING_STATUS_SUCCESS105 = "105"; // 已拼团待开奖(未中奖)
    public static final String GROUP_BOOKING_STATUS_SUCCESS106 = "106"; // 创建订单、未付款


    public static final String SHENNIUDATA_MOBILE_INCREASE = "shenniudata-mobile-increase"; // 优惠卷转增
    public static final String SHENNIUDATA_AUTOMATIC_PUZZLE = "shenniudata-automatic_puzzle"; // 自动拼团

    public static final String PAYMENT_STATUS10 = "10"; // 支付中
    public static final String PAYMENT_STATUS20 = "20"; // 未支付
    public static final String PAYMENT_STATUS30 = "30"; // 支付成功
    public static final String PAYMENT_STATUS40 = "40"; // 支付失败

    public static final String FREEZE_STATUS10 = "10"; // 已冻结
    public static final String FREEZE_STATUS20 = "20"; // 已解冻

    public static final String AUTOMATIC_PUZZLE1 = "1"; // 自动拼团
    public static final String AUTOMATIC_PUZZLE0 = "0"; // 不自动拼团

    public static final String FREEZE_TYPE101 = "101"; // 余额
    public static final String FREEZE_TYPE102 = "102"; // 奖金
    public static final String FREEZE_TYPE103 = "103"; // 通证
    public static final String FREEZE_TYPE104 = "104"; // 购物卷

    public static final String PAYMENT_TYPE0 = "0"; // 微信
    public static final String PAYMENT_TYPE1 = "1"; // 支付宝
    public static final String PAYMENT_TYPE2 = "2"; // 暂定

    public static final String DIMENSION_DAY = "0"; // 查询维度：日
    public static final String DIMENSION_WEEK = "1"; // 查询维度：周
    public static final String DIMENSION_MONTH = "2"; // 查询维度：月

    public static final String DISCOUNT_STATUS_PENDING_REVIEW = "01"; // 折扣记录状态 01商家已扫码（待审核）
    public static final String DISCOUNT_STATUS_REVIEW_PASS = "02"; // 折扣记录状态 02折扣审核通过（已支付）
    public static final String DISCOUNT_STATUS_REVIEW_REJECTED = "03"; // 折扣记录状态 03折扣审核驳回

    public static final Boolean DB_NO_DELETED = false; // 逻辑删除标记 0 未删除
    public static final Boolean DB_DELETED = true; // 逻辑删除标记 1 已删除

    public static final Integer IS_NOT_FOOD_BOSS = 0; // 是否是餐饮老板 0 不是
    public static final Integer IS_FOOD_BOSS = 1; // 是否是餐饮老板 1 是

    public static final String AUDIT_TYPE_01 = "01"; // 优惠支付记录审核类型 01：折扣券支付审核

    public static final String AUDIT_STATUS_01 = "01"; // 优惠支付记录审核状态 01：待审核
    public static final String AUDIT_STATUS_02 = "02"; // 优惠支付记录审核状态 02：审核通过
    public static final String AUDIT_STATUS_03 = "03"; // 优惠支付记录审核状态 03：审核驳回

    public static final String REMITTANCE_STATUS_01 = "01"; // 优惠支付记录打款状态 01：打款中
    public static final String REMITTANCE_STATUS_02 = "02"; // 优惠支付记录打款状态 02：打款成功
    public static final String REMITTANCE_STATUS_03 = "03"; // 优惠支付记录打款状态 03：打款失败
    public static final List<String> MUNICIPALITITES = new ArrayList<>(Arrays.asList("北京市","上海市","重庆市","天津市")); //直辖市
}
