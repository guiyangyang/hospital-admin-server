package com.space.alzheimer.bean;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CaseInfo {

    private Integer pageSize;

    private Integer pageNo;

    private String userName;//用户姓名

    private String caseNum;//病例num唯一

    private String state;// 0-暂存；1-保存

    private String share;// 0-未共享；1-已共享

    private Date createTime;

    private Date updateTime;

    @Excel(name = "病例资料/诊断详情/单位名称",orderNum ="1")
    private String f1_1;
    @Excel(name = "病例资料/诊断详情/单位编号",orderNum ="2")
    private String f1_2;
    @Excel(name = "病例资料/诊断详情/筛查诊断",orderNum ="3")
    private String f1_3;
    @Excel(name = "病例资料/诊断详情/认知水平",orderNum ="4")
    private String f1_4;
    @Excel(name = "病例资料/诊断详情/病因诊断",orderNum ="5")
    private String f1_5;
    @Excel(name = "病例资料/诊断详情/抽血",orderNum ="6")
    private String f1_6;
    @Excel(name = "病例资料/诊断详情/抽血编号",orderNum ="7")
    private String f1_7;
    @Excel(name = "诊断详情/家族史",orderNum ="8")
    private String f1_8;
    @Excel(name = "病例资料/诊断详情/类型",orderNum ="9")
    private String f1_9;
    @Excel(name = "病例资料/诊断详情/第几次回访",orderNum ="10")
    private String f1_10;
    @Excel(name = "病例资料/病历资料/姓名",orderNum ="11")
    private String f1_11;
    @Excel(name = "病例资料/病历资料/性别",orderNum ="12")
    private String f1_12;
    @Excel(name = "病例资料/病历资料/年龄",orderNum ="13")
    private String f1_13;
    @Excel(name = "病例资料/病历资料/教育程度",orderNum ="14")
    private String f1_14;
    @Excel(name = "病例资料/病历资料/病例编号",orderNum ="15")
    private String f1_15;
    @Excel(name = "病例资料/病历资料/身份证号",orderNum ="16")
    private String f1_16;
    @Excel(name = "病例资料/病历资料/推荐医师",orderNum ="17")
    private String f1_17;
    @Excel(name = "病例资料/病历资料/检查医师",orderNum ="18")
    private String f1_18;
    @Excel(name = "病例资料/病历资料/填表日期",orderNum ="19")
    private String f1_19;
    @Excel(name = "认知障碍筛查表/A受试者个人信息/A1 民族",orderNum ="20")
    private String f2_a1_0;
    @Excel(name = "认知障碍筛查表/A受试者个人信息/A1 民族",orderNum ="21")
    private String f2_a1_1;
    @Excel(name = "认知障碍筛查表/A受试者个人信息/A2 长期居住地",orderNum ="22")
    private String f2_a2_0;
    @Excel(name = "认知障碍筛查表/A受试者个人信息/A3 家庭地址",orderNum ="23")
    private String f2_a3_0;
    @Excel(name = "认知障碍筛查表/A受试者个人信息/省、直辖市",orderNum ="24")
    private String f2_a3_1;
    @Excel(name = "认知障碍筛查表/A受试者个人信息/市",orderNum ="25")
    private String f2_a3_2;
    @Excel(name = "认知障碍筛查表/A受试者个人信息/区(县)",orderNum ="26")
    private String f2_a3_3;
    @Excel(name = "认知障碍筛查表/A受试者个人信息/街(路、村)",orderNum ="27")
    private String f2_a3_4;
    @Excel(name = "认知障碍筛查表/A受试者个人信息/小区",orderNum ="28")
    private String f2_a3_5;
    @Excel(name = "认知障碍筛查表/A受试者个人信息/楼",orderNum ="29")
    private String f2_a3_6;
    @Excel(name = "认知障碍筛查表/A受试者个人信息/单元",orderNum ="30")
    private String f2_a3_7;
    @Excel(name = "认知障碍筛查表/A受试者个人信息/乡(镇)",orderNum ="31")
    private String f2_a3_8;
    @Excel(name = "认知障碍筛查表/A受试者个人信息/村",orderNum ="32")
    private String f2_a3_9;
    @Excel(name = "认知障碍筛查表/A受试者个人信息/门牌号",orderNum ="33")
    private String f2_a3_10;
    @Excel(name = "认知障碍筛查表/A受试者个人信息/邮编",orderNum ="34")
    private String f2_a3_11;
    @Excel(name = "认知障碍筛查表/A受试者个人信息/A4.1固定电话",orderNum ="35")
    private String f2_a4_1;
    @Excel(name = "认知障碍筛查表/A受试者个人信息/A4.2手机号",orderNum ="36")
    private String f2_a4_2;
    @Excel(name = "认知障碍筛查表/A受试者个人信息/A5利手",orderNum ="37")
    private String f2_a5_0;
    @Excel(name = "认知障碍筛查表/A受试者个人信息/A6主要职业",orderNum ="38")
    private String f2_a6_0;
    @Excel(name = "认知障碍筛查表/A受试者个人信息/记录具体工作（退休前）",orderNum ="39")
    private String f2_a6_1;
    @Excel(name = "认知障碍筛查表/A受试者个人信息/A7婚姻状况",orderNum ="40")
    private String f2_a7_1;
    @Excel(name = "认知障碍筛查表/A受试者个人信息/A8受试生活状况",orderNum ="41")
    private String f2_a8_1;
    @Excel(name = "认知障碍筛查表/A受试者个人信息/A9知情者与受试者的关系",orderNum ="42")
    private String f2_a9_1;
    @Excel(name = "认知障碍筛查表/A受试者个人信息/A9知情者与受试者的关系",orderNum ="43")
    private String f2_a9_2;
    @Excel(name = "认知障碍筛查表/A受试者个人信息/A10 信息的可靠程度",orderNum ="44")
    private String f2_a10_1;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/Ⅰ1.1 现在是哪一年？",orderNum ="45")
    private String f2_i1_1;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/Ⅰ1.2 现在是什么季节？",orderNum ="46")
    private String f2_i1_2;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/Ⅰ1.3 现在是几月份？",orderNum ="47")
    private String f2_i1_3;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/ⅠⅠ1.4 今天是几号？",orderNum ="48")
    private String f2_i1_4;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/Ⅰ1.5 今天是星期几？",orderNum ="49")
    private String f2_i1_5;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/Ⅰ1.6 这是什么城市（城市名）？",orderNum ="50")
    private String f2_i1_6;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/Ⅰ1.7 这是什么区（城区名）？",orderNum ="51")
    private String f2_i1_7;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/Ⅰ1.8 这是什么街道？",orderNum ="52")
    private String f2_i1_8;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/Ⅰ1.9 这是第几层楼？",orderNum ="53")
    private String f2_i1_9;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/Ⅰ1.10 这是什么地方？？",orderNum ="54")
    private String f2_i1_10;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/Ⅰ1.11 皮球",orderNum ="55")
    private String f2_i1_11;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/Ⅰ1.12 国旗",orderNum ="56")
    private String f2_i1_12;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/Ⅰ1.13 树木",orderNum ="57")
    private String f2_i1_13;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/Ⅰ1.14 100－7=93",orderNum ="58")
    private String f2_i1_14;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/Ⅰ1.15 93－7=86",orderNum ="59")
    private String f2_i1_15;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/Ⅰ1.16 86－7=79",orderNum ="60")
    private String f2_i1_16;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/Ⅰ1.17 79－7=72",orderNum ="61")
    private String f2_i1_17;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/Ⅰ1.18 72－7=65",orderNum ="62")
    private String f2_i1_18;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/Ⅰ1.19 皮球",orderNum ="63")
    private String f2_i1_19;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/Ⅰ1.20 国旗",orderNum ="64")
    private String f2_i1_20;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/Ⅰ1.21 树木",orderNum ="65")
    private String f2_i1_21;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/Ⅰ1.22 检查者出示手表",orderNum ="66")
    private String f2_i1_22;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/Ⅰ1.23 检查者出示铅笔",orderNum ="67")
    private String f2_i1_23;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/Ⅰ1.24 我说一句话，我说完以后您重复一遍，好吗？“大家齐心协力拉紧绳”",orderNum ="68")
    private String f2_i1_24;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/Ⅰ1.25 “请闭上您的眼睛”请您念一念这句话，并按这句话的意思去做",orderNum ="69")
    private String f2_i1_25;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/Ⅰ1.26 右手拿纸",orderNum ="70")
    private String f2_i1_26;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/Ⅰ1.27 双手对折",orderNum ="71")
    private String f2_i1_27;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/Ⅰ1.28 放到左腿上",orderNum ="72")
    private String f2_i1_28;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/9．请您写一个完整的句子，要有主、谓语，什么内容都可以",orderNum ="73")
    private String f2_i1_29_1;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/9．请您写一个完整的句子，要有主、谓语，什么内容都可以",orderNum ="74")
    private String f2_i1_29_2;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/10．请您照着这个样子把它画下来",orderNum ="75")
    private String f2_i1_30;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/10．请您照着这个样子把它画下来图片地址",orderNum ="76")
    private String f2_i1_30_img;
    @Excel(name = "认知障碍筛查表/Ⅰ1 简明精神状态检查/Ⅰ1.31 总分",orderNum ="77")
    private String f2_i1_31;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/Ⅰ2.1 交替连线测验",orderNum ="78")
    private String f2_i2_1;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/Ⅰ2.1 交替连线测验图片地址",orderNum ="79")
    private String f2_i2_1_img;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/Ⅰ2.2 视空间结构（立方体）",orderNum ="80")
    private String f2_i2_2;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/Ⅰ2.2 视空间结构（立方体）图片地址",orderNum ="81")
    private String f2_i2_2_img;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/Ⅰ2.3 视空间结构（钟表）",orderNum ="82")
    private String f2_i2_3;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/Ⅰ2.3 视空间结构（钟表）图片地址",orderNum ="83")
    private String f2_i2_3_img;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/1 外形类似钟",orderNum ="84")
    private String f2_i2_3_1;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/2 有圆形外周",orderNum ="85")
    private String f2_i2_3_2;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/3 直径>2.5厘米",orderNum ="86")
    private String f2_i2_3_3;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/4 所有的数字都在圆圈内",orderNum ="87")
    private String f2_i2_3_4;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/5 先定位12，6，3，9",orderNum ="88")
    private String f2_i2_3_5;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/6 数字按一定间隔排列（以12-6为轴呈对称排列）",orderNum ="89")
    private String f2_i2_3_6;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/7 如果有空间排列错误出现，能够进行修正",orderNum ="90")
    private String f2_i2_3_7;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/8 只有阿拉伯数字",orderNum ="91")
    private String f2_i2_3_8;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/9 只有阿拉伯数字1-12出现",orderNum ="92")
    private String f2_i2_3_9;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/10 1-12顺序出现，无省略或错序",orderNum ="93")
    private String f2_i2_3_10;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/11 只有2个指针",orderNum ="94")
    private String f2_i2_3_11;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/12 指针为箭头样",orderNum ="95")
    private String f2_i2_3_12;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/13 时针在11点与12点之间",orderNum ="96")
    private String f2_i2_3_13;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/14 分针比时针长",orderNum ="97")
    private String f2_i2_3_14;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/15 无下列问题",orderNum ="98")
    private String f2_i2_3_15;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/（1）狮子",orderNum ="99")
    private String f2_i2_4_1;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/（2）长颈鹿",orderNum ="100")
    private String f2_i2_4_2;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/（3）骆驼或单峰骆驼",orderNum ="101")
    private String f2_i2_4_3;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/第一次：（1）面孔",orderNum ="102")
    private String f2_i2_5_1_1;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/第一次：（2）丝绸",orderNum ="103")
    private String f2_i2_5_1_2;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/第一次：（3）学校",orderNum ="104")
    private String f2_i2_5_1_3;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/第一次：（4）菊花",orderNum ="105")
    private String f2_i2_5_1_4;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/第一次：（5）红色",orderNum ="106")
    private String f2_i2_5_1_5;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/第二次：（1）面孔",orderNum ="107")
    private String f2_i2_5_2_1;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/第二次：（2）丝绸",orderNum ="108")
    private String f2_i2_5_2_2;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/第二次：（3）学校",orderNum ="109")
    private String f2_i2_5_2_3;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/第二次：（4）菊花",orderNum ="110")
    private String f2_i2_5_2_4;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/第二次：（5）红色",orderNum ="111")
    private String f2_i2_5_2_5;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/Ⅰ2.6 数字广度顺背",orderNum ="112")
    private String f2_i2_6_1;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/Ⅰ2.7 数字广度倒背",orderNum ="113")
    private String f2_i2_7_1;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/Ⅰ2.8 警觉性",orderNum ="114")
    private String f2_i2_8_1;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/Ⅰ2.9 连续减7",orderNum ="115")
    private String f2_i2_9_1;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/2.10 句子复述",orderNum ="116")
    private String f2_i2_10_1;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/Ⅰ2.11 词语流畅性",orderNum ="117")
    private String f2_i2_11_0;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/Ⅰ2.11 词语流畅性/Ⅰ2.11.2（16-30秒）",orderNum ="118")
    private String f2_i2_11_1;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/Ⅰ2.11 词语流畅性/Ⅰ2.11.1（0-15秒）",orderNum ="119")
    private String f2_i2_11_2;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/Ⅰ2.11 词语流畅性/Ⅰ2.11.3（31-45秒）",orderNum ="120")
    private String f2_i2_11_3;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/Ⅰ2.11 词语流畅性/Ⅰ2.11.4（46-60秒）",orderNum ="121")
    private String f2_i2_11_4;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/Ⅰ2.12 抽象",orderNum ="122")
    private String f2_i2_12_1;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/Ⅰ2.13 延迟回忆/1面孔",orderNum ="123")
    private String f2_i2_13_1_1;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/Ⅰ2.13 延迟回忆/1面孔提示",orderNum ="124")
    private String f2_i2_13_1_2;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/Ⅰ2.13 延迟回忆/2丝绸",orderNum ="125")
    private String f2_i2_13_2_1;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/Ⅰ2.13 延迟回忆/2丝绸提示",orderNum ="126")
    private String f2_i2_13_2_2;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/Ⅰ2.13 延迟回忆/3学校",orderNum ="127")
    private String f2_i2_13_3_1;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/Ⅰ2.13 延迟回忆/3学校提示",orderNum ="128")
    private String f2_i2_13_3_2;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/Ⅰ2.13 延迟回忆/4菊花",orderNum ="129")
    private String f2_i2_13_4_1;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/Ⅰ2.13 延迟回忆/4菊花提示",orderNum ="130")
    private String f2_i2_13_4_2;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/Ⅰ2.13 延迟回忆/5红色",orderNum ="131")
    private String f2_i2_13_5_1;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/Ⅰ2.13 延迟回忆/5红色提示",orderNum ="132")
    private String f2_i2_13_5_2;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/Ⅰ2.14 定向",orderNum ="133")
    private String f2_i2_14;
    @Excel(name = "认知障碍筛查表/Ⅰ2 蒙特利尔认知测验/2.15 总分",orderNum ="134")
    private String f2_i2_15;
    @Excel(name = "认知障碍筛查表/N 筛查诊断/N 筛查诊断",orderNum ="135")
    private String f2_n_1;
    @Excel(name = "认知障碍筛查表/N 筛查诊断/评定医师",orderNum ="136")
    private String f2_n_2;
    @Excel(name = "认知障碍筛查表/N 筛查诊断/评定日期",orderNum ="137")
    private String f2_n_3;
    @Excel(name = "认知障碍评定表/H缺血评分/H1 急性起病",orderNum ="138")
    private String f3_h_1;
    @Excel(name = "认知障碍评定表/H缺血评分/H2 阶梯性加重",orderNum ="139")
    private String f3_h_2;
    @Excel(name = "认知障碍评定表/H缺血评分/H3 诉说躯体症状",orderNum ="140")
    private String f3_h_3;
    @Excel(name = "认知障碍评定表/H缺血评分/H4 情感失控",orderNum ="141")
    private String f3_h_4;
    @Excel(name = "认知障碍评定表/H缺血评分/H5 高血压史",orderNum ="142")
    private String f3_h_5;
    @Excel(name = "认知障碍评定表/H缺血评分/H6 卒中史",orderNum ="143")
    private String f3_h_6;
    @Excel(name = "认知障碍评定表/H缺血评分/H7 神经系统局灶性症状",orderNum ="144")
    private String f3_h_7;
    @Excel(name = "认知障碍评定表/H缺血评分/H8 神经系统局灶性体征",orderNum ="145")
    private String f3_h_8;
    @Excel(name = "认知障碍评定表/H缺血评分/H9 总分",orderNum ="146")
    private String f3_h_9;
    @Excel(name = "认知障碍评定表/I3即刻记忆/近3个月受试曾做过这个检查？",orderNum ="147")
    private String f3_i3_0_1;
    @Excel(name = "认知障碍评定表/I3即刻记忆/近3个月受试曾做过这个检查？选择日期",orderNum ="148")
    private String f3_i3_0_2;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 胳膊/是否正确",orderNum ="149")
    private String f3_i3_1_1_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 胳膊/是否插入",orderNum ="150")
    private String f3_i3_1_1_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 胳膊/是否重复",orderNum ="151")
    private String f3_i3_1_1_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 胳膊/是否正确",orderNum ="152")
    private String f3_i3_1_2_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 胳膊/是否插入",orderNum ="153")
    private String f3_i3_1_2_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 胳膊/是否重复",orderNum ="154")
    private String f3_i3_1_2_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 胳膊/是否正确",orderNum ="155")
    private String f3_i3_1_3_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 胳膊/是否插入",orderNum ="156")
    private String f3_i3_1_3_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 胳膊/是否重复",orderNum ="157")
    private String f3_i3_1_3_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 猫/是否正确",orderNum ="158")
    private String f3_i3_2_1_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 猫/是否插入",orderNum ="159")
    private String f3_i3_2_1_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 猫/是否重复",orderNum ="160")
    private String f3_i3_2_1_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 猫/是否正确",orderNum ="161")
    private String f3_i3_2_2_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 猫/是否插入",orderNum ="162")
    private String f3_i3_2_2_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 猫/是否重复",orderNum ="163")
    private String f3_i3_2_2_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 猫/是否正确",orderNum ="164")
    private String f3_i3_2_3_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 猫/是否插入",orderNum ="165")
    private String f3_i3_2_3_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 猫/是否重复",orderNum ="166")
    private String f3_i3_2_3_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 斧子/是否正确",orderNum ="167")
    private String f3_i3_3_1_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 斧子/是否插入",orderNum ="168")
    private String f3_i3_3_1_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 斧子/是否重复",orderNum ="169")
    private String f3_i3_3_1_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 斧子/是否正确",orderNum ="170")
    private String f3_i3_3_2_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 斧子/是否插入",orderNum ="171")
    private String f3_i3_3_2_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 斧子/是否重复",orderNum ="172")
    private String f3_i3_3_2_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 斧子/是否正确",orderNum ="173")
    private String f3_i3_3_3_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 斧子/是否插入",orderNum ="174")
    private String f3_i3_3_3_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 斧子/是否重复",orderNum ="175")
    private String f3_i3_3_3_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 床/是否正确",orderNum ="176")
    private String f3_i3_4_1_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 床/是否插入",orderNum ="177")
    private String f3_i3_4_1_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 床/是否重复",orderNum ="178")
    private String f3_i3_4_1_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 床/是否正确",orderNum ="179")
    private String f3_i3_4_2_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 床/是否插入",orderNum ="180")
    private String f3_i3_4_2_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 床/是否重复",orderNum ="181")
    private String f3_i3_4_2_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 床/是否正确",orderNum ="182")
    private String f3_i3_4_3_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 床/是否插入",orderNum ="183")
    private String f3_i3_4_3_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 床/是否重复",orderNum ="184")
    private String f3_i3_4_3_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 飞机/是否正确",orderNum ="185")
    private String f3_i3_5_1_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 飞机/是否插入",orderNum ="186")
    private String f3_i3_5_1_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 飞机/是否重复",orderNum ="187")
    private String f3_i3_5_1_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 飞机/是否正确",orderNum ="188")
    private String f3_i3_5_2_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 飞机/是否插入",orderNum ="189")
    private String f3_i3_5_2_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 飞机/是否重复",orderNum ="190")
    private String f3_i3_5_2_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 飞机/是否正确",orderNum ="191")
    private String f3_i3_5_3_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 飞机/是否插入",orderNum ="192")
    private String f3_i3_5_3_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 飞机/是否重复",orderNum ="193")
    private String f3_i3_5_3_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 耳朵/是否正确",orderNum ="194")
    private String f3_i3_6_1_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 耳朵/是否插入",orderNum ="195")
    private String f3_i3_6_1_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 耳朵/是否重复",orderNum ="196")
    private String f3_i3_6_1_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 耳朵/是否正确",orderNum ="197")
    private String f3_i3_6_2_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 耳朵/是否插入",orderNum ="198")
    private String f3_i3_6_2_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 耳朵/是否重复",orderNum ="199")
    private String f3_i3_6_2_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 耳朵/是否正确",orderNum ="200")
    private String f3_i3_6_3_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 耳朵/是否插入",orderNum ="201")
    private String f3_i3_6_3_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 耳朵/是否重复",orderNum ="202")
    private String f3_i3_6_3_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 狗/是否正确",orderNum ="203")
    private String f3_i3_7_1_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 狗/是否插入",orderNum ="204")
    private String f3_i3_7_1_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 狗/是否重复",orderNum ="205")
    private String f3_i3_7_1_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 狗/是否正确",orderNum ="206")
    private String f3_i3_7_2_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 狗/是否插入",orderNum ="207")
    private String f3_i3_7_2_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 狗/是否重复",orderNum ="208")
    private String f3_i3_7_2_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 狗/是否正确",orderNum ="209")
    private String f3_i3_7_3_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 狗/是否插入",orderNum ="210")
    private String f3_i3_7_3_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 狗/是否重复",orderNum ="211")
    private String f3_i3_7_3_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 锤子/是否正确",orderNum ="212")
    private String f3_i3_8_1_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 锤子/是否插入",orderNum ="213")
    private String f3_i3_8_1_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 锤子/是否重复",orderNum ="214")
    private String f3_i3_8_1_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 锤子/是否正确",orderNum ="215")
    private String f3_i3_8_2_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 锤子/是否插入",orderNum ="216")
    private String f3_i3_8_2_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 锤子/是否重复",orderNum ="217")
    private String f3_i3_8_2_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 锤子/是否正确",orderNum ="218")
    private String f3_i3_8_3_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 锤子/是否插入",orderNum ="219")
    private String f3_i3_8_3_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 锤子/是否重复",orderNum ="220")
    private String f3_i3_8_3_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 椅子/是否正确",orderNum ="221")
    private String f3_i3_9_1_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 椅子/是否插入",orderNum ="222")
    private String f3_i3_9_1_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 椅子/是否重复",orderNum ="223")
    private String f3_i3_9_1_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 椅子/是否正确",orderNum ="224")
    private String f3_i3_9_2_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 椅子/是否插入",orderNum ="225")
    private String f3_i3_9_2_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 椅子/是否重复",orderNum ="226")
    private String f3_i3_9_2_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 椅子/是否正确",orderNum ="227")
    private String f3_i3_9_3_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 椅子/是否插入",orderNum ="228")
    private String f3_i3_9_3_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 椅子/是否重复",orderNum ="229")
    private String f3_i3_9_3_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 轿车/是否正确",orderNum ="230")
    private String f3_i3_10_1_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 轿车/是否插入",orderNum ="231")
    private String f3_i3_10_1_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 轿车/是否重复",orderNum ="232")
    private String f3_i3_10_1_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 轿车/是否正确",orderNum ="233")
    private String f3_i3_10_2_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 轿车/是否插入",orderNum ="234")
    private String f3_i3_10_2_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 轿车/是否重复",orderNum ="235")
    private String f3_i3_10_2_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 轿车/是否正确",orderNum ="236")
    private String f3_i3_10_3_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 轿车/是否插入",orderNum ="237")
    private String f3_i3_10_3_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 轿车/是否重复",orderNum ="238")
    private String f3_i3_10_3_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 眼睛/是否正确",orderNum ="239")
    private String f3_i3_11_1_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 眼睛/是否插入",orderNum ="240")
    private String f3_i3_11_1_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 眼睛/是否重复",orderNum ="241")
    private String f3_i3_11_1_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 眼睛/是否正确",orderNum ="242")
    private String f3_i3_11_2_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 眼睛/是否插入",orderNum ="243")
    private String f3_i3_11_2_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 眼睛/是否重复",orderNum ="244")
    private String f3_i3_11_2_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 眼睛/是否正确",orderNum ="245")
    private String f3_i3_11_3_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 眼睛/是否插入",orderNum ="246")
    private String f3_i3_11_3_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 眼睛/是否重复",orderNum ="247")
    private String f3_i3_11_3_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 马/是否正确",orderNum ="248")
    private String f3_i3_12_1_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 马/是否插入",orderNum ="249")
    private String f3_i3_12_1_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 马/是否重复",orderNum ="250")
    private String f3_i3_12_1_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 马/是否正确",orderNum ="251")
    private String f3_i3_12_2_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 马/是否插入",orderNum ="252")
    private String f3_i3_12_2_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 马/是否重复",orderNum ="253")
    private String f3_i3_12_2_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 马/是否正确",orderNum ="254")
    private String f3_i3_12_3_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 马/是否插入",orderNum ="255")
    private String f3_i3_12_3_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 马/是否重复",orderNum ="256")
    private String f3_i3_12_3_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 刀子/是否正确",orderNum ="257")
    private String f3_i3_13_1_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 刀子/是否插入",orderNum ="258")
    private String f3_i3_13_1_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 刀子/是否重复",orderNum ="259")
    private String f3_i3_13_1_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 刀子/是否正确",orderNum ="260")
    private String f3_i3_13_2_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 刀子/是否插入",orderNum ="261")
    private String f3_i3_13_2_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 刀子/是否重复",orderNum ="262")
    private String f3_i3_13_2_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 刀子/是否正确",orderNum ="263")
    private String f3_i3_13_3_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 刀子/是否插入",orderNum ="264")
    private String f3_i3_13_3_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 刀子/是否重复",orderNum ="265")
    private String f3_i3_13_3_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 钟/是否正确",orderNum ="266")
    private String f3_i3_14_1_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 钟/是否插入",orderNum ="267")
    private String f3_i3_14_1_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 钟/是否重复",orderNum ="268")
    private String f3_i3_14_1_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 钟/是否正确",orderNum ="269")
    private String f3_i3_14_2_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 钟/是否插入",orderNum ="270")
    private String f3_i3_14_2_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 钟/是否重复",orderNum ="271")
    private String f3_i3_14_2_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 钟/是否正确",orderNum ="272")
    private String f3_i3_14_3_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 钟/是否插入",orderNum ="273")
    private String f3_i3_14_3_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 钟/是否重复",orderNum ="274")
    private String f3_i3_14_3_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 自行车/是否正确",orderNum ="275")
    private String f3_i3_15_1_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 自行车/是否插入",orderNum ="276")
    private String f3_i3_15_1_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍（1） 自行车/是否重复",orderNum ="277")
    private String f3_i3_15_1_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 自行车/是否正确",orderNum ="278")
    private String f3_i3_15_2_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 自行车/是否插入",orderNum ="279")
    private String f3_i3_15_2_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍（1） 自行车/是否重复",orderNum ="280")
    private String f3_i3_15_2_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 自行车/是否正确",orderNum ="281")
    private String f3_i3_15_3_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 自行车/是否插入",orderNum ="282")
    private String f3_i3_15_3_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍（1） 自行车/是否重复",orderNum ="283")
    private String f3_i3_15_3_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍/正确个数",orderNum ="284")
    private String f3_i3_tnum_1;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍/正确个数",orderNum ="285")
    private String f3_i3_tnum_2;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍/正确个数",orderNum ="286")
    private String f3_i3_tnum_3;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍/插入数",orderNum ="287")
    private String f3_i3_inum_1;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍/插入数",orderNum ="288")
    private String f3_i3_inum_2;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍/插入数",orderNum ="289")
    private String f3_i3_inum_3;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍/重复数",orderNum ="290")
    private String f3_i3_rnum_1;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍/重复数",orderNum ="291")
    private String f3_i3_rnum_2;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍/重复数",orderNum ="292")
    private String f3_i3_rnum_3;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第一遍/插入记录",orderNum ="293")
    private String f3_i3_inote_1;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第二遍/插入记录",orderNum ="294")
    private String f3_i3_inote_2;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/第三遍/插入记录",orderNum ="295")
    private String f3_i3_inote_3;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/3遍正确回忆总数",orderNum ="296")
    private String f3_i3_total_t;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/3遍插入总数 ",orderNum ="297")
    private String f3_i3_total_i;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/3遍重复回忆总数",orderNum ="298")
    private String f3_i3_total_r;
    @Excel(name = "认知障碍评定表/I3即刻记忆/Ⅰ3.1 即刻记忆/记忆策略",orderNum ="299")
    private String f3_i3_way;
    @Excel(name = "认知障碍评定表/I4 数字广度测验/顺向数字广度长度",orderNum ="300")
    private String f3_i4_1;
    @Excel(name = "认知障碍评定表/I4 数字广度测验/逆向数字广度长度",orderNum ="301")
    private String f3_i4_2;
    @Excel(name = "认知障碍评定表/I5 连线测验/I5.1 A 部分/全部数字完成时间",orderNum ="302")
    private String f3_i5_1_1;
    @Excel(name = "认知障碍评定表/I5 连线测验/I5.1 A 部分/错误数",orderNum ="303")
    private String f3_i5_1_2;
    @Excel(name = "认知障碍评定表/I5 连线测验/I5.1 A 部分/正确数",orderNum ="304")
    private String f3_i5_1_3;
    @Excel(name = "认知障碍评定表/I5 连线测验/I5.1 A 部分/图片",orderNum ="305")
    private String f3_i5_1_img;
    @Excel(name = "认知障碍评定表/I5 连线测验/I5.2 B 部分/全部数字完成时间",orderNum ="306")
    private String f3_i5_2_1;
    @Excel(name = "认知障碍评定表/I5 连线测验/I5.2 B 部分/数字顺序错误数",orderNum ="307")
    private String f3_i5_3_2;
    @Excel(name = "认知障碍评定表/I5 连线测验/I5.2 B 部分/正确的线条数",orderNum ="308")
    private String f3_i5_4_3;
    @Excel(name = "认知障碍评定表/I5 连线测验/I5.2 B 部分/图片",orderNum ="309")
    private String f3_i5_5_img;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.1/2.树/回答",orderNum ="310")
    private String f3_i6_1_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.1/2.树/具体记录",orderNum ="311")
    private String f3_i6_1_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.1/2.树/提示回答",orderNum ="312")
    private String f3_i6_1_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.1/2.树/提示具体记录",orderNum ="313")
    private String f3_i6_1_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.1/2.树/提示请选择",orderNum ="314")
    private String f3_i6_1_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.2/3.笔/回答",orderNum ="315")
    private String f3_i6_2_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.2/3.笔/具体记录",orderNum ="316")
    private String f3_i6_2_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.2/3.笔/提示回答",orderNum ="317")
    private String f3_i6_2_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.2/3.笔/提示具体记录",orderNum ="318")
    private String f3_i6_2_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.2/3.笔/提示请选择",orderNum ="319")
    private String f3_i6_2_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.3/6.剪刀/回答",orderNum ="320")
    private String f3_i6_3_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.3/6.剪刀/具体记录",orderNum ="321")
    private String f3_i6_3_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.3/6.剪刀/提示回答",orderNum ="322")
    private String f3_i6_3_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.3/6.剪刀/提示具体记录",orderNum ="323")
    private String f3_i6_3_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.3/6.剪刀/提示请选择",orderNum ="324")
    private String f3_i6_3_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.4/8.花/回答",orderNum ="325")
    private String f3_i6_4_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.4/8.花/具体记录",orderNum ="326")
    private String f3_i6_4_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.4/8.花/提示回答",orderNum ="327")
    private String f3_i6_4_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.4/8.花/提示具体记录",orderNum ="328")
    private String f3_i6_4_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.4/8.花/提示请选择",orderNum ="329")
    private String f3_i6_4_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.5/9.锯子/回答",orderNum ="330")
    private String f3_i6_5_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.5/9.锯子/具体记录",orderNum ="331")
    private String f3_i6_5_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.5/9.锯子/提示回答",orderNum ="332")
    private String f3_i6_5_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.5/9.锯子/提示具体记录",orderNum ="333")
    private String f3_i6_5_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.5/9.锯子/提示请选择",orderNum ="334")
    private String f3_i6_5_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.6/12.扫把/回答",orderNum ="335")
    private String f3_i6_6_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.6/12.扫把/具体记录",orderNum ="336")
    private String f3_i6_6_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.6/12.扫把/提示回答",orderNum ="337")
    private String f3_i6_6_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.6/12.扫把/提示具体记录",orderNum ="338")
    private String f3_i6_6_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.6/12.扫把/提示请选择",orderNum ="339")
    private String f3_i6_6_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.7/14.冬菇/回答",orderNum ="340")
    private String f3_i6_7_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.7/14.冬菇/具体记录",orderNum ="341")
    private String f3_i6_7_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.7/14.冬菇/提示回答",orderNum ="342")
    private String f3_i6_7_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.7/14.冬菇/提示具体记录",orderNum ="343")
    private String f3_i6_7_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.7/14.冬菇/提示请选择",orderNum ="344")
    private String f3_i6_7_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.8/15.衣架/回答",orderNum ="345")
    private String f3_i6_8_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.8/15.衣架/具体记录",orderNum ="346")
    private String f3_i6_8_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.8/15.衣架/提示回答",orderNum ="347")
    private String f3_i6_8_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.8/15.衣架/提示具体记录",orderNum ="348")
    private String f3_i6_8_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.8/15.衣架/提示请选择",orderNum ="349")
    private String f3_i6_8_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.9/16.轮椅/回答",orderNum ="350")
    private String f3_i6_9_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.9/16.轮椅/具体记录",orderNum ="351")
    private String f3_i6_9_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.9/16.轮椅/提示回答",orderNum ="352")
    private String f3_i6_9_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.9/16.轮椅/提示具体记录",orderNum ="353")
    private String f3_i6_9_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.9/16.轮椅/提示请选择",orderNum ="354")
    private String f3_i6_9_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.10/17.骆驼/回答",orderNum ="355")
    private String f3_i6_10_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.10/17.骆驼/具体记录",orderNum ="356")
    private String f3_i6_10_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.10/17.骆驼/提示回答",orderNum ="357")
    private String f3_i6_10_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.10/17.骆驼/提示具体记录",orderNum ="358")
    private String f3_i6_10_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.10/17.骆驼/提示请选择",orderNum ="359")
    private String f3_i6_10_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.11/21.羽毛球拍/回答",orderNum ="360")
    private String f3_i6_11_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.11/21.羽毛球拍/具体记录",orderNum ="361")
    private String f3_i6_11_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.11/21.羽毛球拍/提示回答",orderNum ="362")
    private String f3_i6_11_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.11/21.羽毛球拍/提示具体记录",orderNum ="363")
    private String f3_i6_11_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.11/21.羽毛球拍/提示请选择",orderNum ="364")
    private String f3_i6_11_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.12/22.蜗牛/回答",orderNum ="365")
    private String f3_i6_12_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.12/22.蜗牛/具体记录",orderNum ="366")
    private String f3_i6_12_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.12/22.蜗牛/提示回答",orderNum ="367")
    private String f3_i6_12_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.12/22.蜗牛/提示具体记录",orderNum ="368")
    private String f3_i6_12_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.12/22.蜗牛/提示请选择",orderNum ="369")
    private String f3_i6_12_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.13/24.海马/回答",orderNum ="370")
    private String f3_i6_13_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.13/24.海马/具体记录",orderNum ="371")
    private String f3_i6_13_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.13/24.海马/提示回答",orderNum ="372")
    private String f3_i6_13_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.13/24.海马/提示具体记录",orderNum ="373")
    private String f3_i6_13_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.13/24.海马/提示请选择",orderNum ="374")
    private String f3_i6_13_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.14/25.飞标/回答",orderNum ="375")
    private String f3_i6_14_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.14/25.飞标/具体记录",orderNum ="376")
    private String f3_i6_14_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.11/21.羽毛球拍/提示回答",orderNum ="377")
    private String f3_i6_14_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.11/21.羽毛球拍/提示具体记录",orderNum ="378")
    private String f3_i6_14_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.11/21.羽毛球拍/提示请选择",orderNum ="379")
    private String f3_i6_14_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.15/30.口琴/回答",orderNum ="380")
    private String f3_i6_15_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.15/30.口琴/具体记录",orderNum ="381")
    private String f3_i6_15_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.15/30.口琴/提示回答",orderNum ="382")
    private String f3_i6_15_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.15/30.口琴/提示具体记录",orderNum ="383")
    private String f3_i6_15_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.11/21.羽毛球拍/提示请选择",orderNum ="384")
    private String f3_i6_15_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.16/31.犀牛/回答",orderNum ="385")
    private String f3_i6_16_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.16/31.犀牛/具体记录",orderNum ="386")
    private String f3_i6_16_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.16/31.犀牛/提示回答",orderNum ="387")
    private String f3_i6_16_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.16/31.犀牛/提示具体记录",orderNum ="388")
    private String f3_i6_16_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.16/31.犀牛/提示请选择",orderNum ="389")
    private String f3_i6_16_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.17/33.冰屋/回答",orderNum ="390")
    private String f3_i6_17_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.17/33.冰屋/具体记录",orderNum ="391")
    private String f3_i6_17_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.17/33.冰屋/提示回答",orderNum ="392")
    private String f3_i6_17_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.17/33.冰屋/提示具体记录",orderNum ="393")
    private String f3_i6_17_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.17/33.冰屋/提示请选择",orderNum ="394")
    private String f3_i6_17_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.18/36.仙人掌/回答",orderNum ="395")
    private String f3_i6_18_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.18/36.仙人掌/具体记录",orderNum ="396")
    private String f3_i6_18_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.18/36.仙人掌/提示回答",orderNum ="397")
    private String f3_i6_18_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.18/36.仙人掌/提示具体记录",orderNum ="398")
    private String f3_i6_18_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.18/36.仙人掌/提示请选择",orderNum ="399")
    private String f3_i6_18_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.19/37.扶手电梯/回答",orderNum ="400")
    private String f3_i6_19_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.19/37.扶手电梯/具体记录",orderNum ="401")
    private String f3_i6_19_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.19/37.扶手电梯/提示回答",orderNum ="402")
    private String f3_i6_19_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.19/37.扶手电梯/提示具体记录",orderNum ="403")
    private String f3_i6_19_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.19/37.扶手电梯/提示请选择",orderNum ="404")
    private String f3_i6_19_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.20/38.竖琴/回答",orderNum ="405")
    private String f3_i6_20_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.20/38.竖琴/具体记录",orderNum ="406")
    private String f3_i6_20_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.20/38.竖琴/提示回答",orderNum ="407")
    private String f3_i6_20_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.20/38.竖琴/提示具体记录",orderNum ="408")
    private String f3_i6_20_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.20/38.竖琴/提示请选择",orderNum ="409")
    private String f3_i6_20_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.21/42.听诊器/回答",orderNum ="410")
    private String f3_i6_21_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.21/42.听诊器/具体记录",orderNum ="411")
    private String f3_i6_21_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.21/42.听诊器/提示回答",orderNum ="412")
    private String f3_i6_21_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.21/42.听诊器/提示具体记录",orderNum ="413")
    private String f3_i6_21_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.21/42.听诊器/提示请选择",orderNum ="414")
    private String f3_i6_21_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.22/43.金字塔/回答",orderNum ="415")
    private String f3_i6_22_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.22/43.金字塔/具体记录",orderNum ="416")
    private String f3_i6_22_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.22/43.金字塔/提示回答",orderNum ="417")
    private String f3_i6_22_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.22/43.金字塔/提示具体记录",orderNum ="418")
    private String f3_i6_22_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.22/43.金字塔/提示请选择",orderNum ="419")
    private String f3_i6_22_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.23/46.漏斗/回答",orderNum ="420")
    private String f3_i6_23_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.23/46.漏斗/具体记录",orderNum ="421")
    private String f3_i6_23_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.23/46.漏斗/提示回答",orderNum ="422")
    private String f3_i6_23_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.23/46.漏斗/提示具体记录",orderNum ="423")
    private String f3_i6_23_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.23/46.漏斗/提示请选择",orderNum ="424")
    private String f3_i6_23_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.24/47.手风琴/回答",orderNum ="425")
    private String f3_i6_24_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.24/47.手风琴/具体记录",orderNum ="426")
    private String f3_i6_24_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.24/47.手风琴/提示回答",orderNum ="427")
    private String f3_i6_24_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.24/47.手风琴/提示具体记录",orderNum ="428")
    private String f3_i6_24_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.24/47.手风琴/提示请选择",orderNum ="429")
    private String f3_i6_24_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.25/50.圆规/回答",orderNum ="430")
    private String f3_i6_25_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.25/50.圆规/具体记录",orderNum ="431")
    private String f3_i6_25_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.25/50.圆规/提示回答",orderNum ="432")
    private String f3_i6_25_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.25/50.圆规/提示具体记录",orderNum ="433")
    private String f3_i6_25_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.25/50.圆规/提示请选择",orderNum ="434")
    private String f3_i6_25_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.26/52.三脚架/回答",orderNum ="435")
    private String f3_i6_26_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.26/52.三脚架/具体记录",orderNum ="436")
    private String f3_i6_26_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.26/52.三脚架/提示回答",orderNum ="437")
    private String f3_i6_26_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.26/52.三脚架/提示具体记录",orderNum ="438")
    private String f3_i6_26_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.26/52.三脚架/提示请选择",orderNum ="439")
    private String f3_i6_26_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.27/54.钳/回答",orderNum ="440")
    private String f3_i6_27_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.27/54.钳/具体记录",orderNum ="441")
    private String f3_i6_27_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.27/54.钳/提示回答",orderNum ="442")
    private String f3_i6_27_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.27/54.钳/提示具体记录",orderNum ="443")
    private String f3_i6_27_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.27/54.钳/提示请选择",orderNum ="444")
    private String f3_i6_27_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.28/57.花棚/回答",orderNum ="445")
    private String f3_i6_28_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.28/57.花棚/具体记录",orderNum ="446")
    private String f3_i6_28_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.28/57.花棚/提示回答",orderNum ="447")
    private String f3_i6_28_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.28/57.花棚/提示具体记录",orderNum ="448")
    private String f3_i6_28_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.28/57.花棚/提示请选择",orderNum ="449")
    private String f3_i6_28_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.29/59.量角器/回答",orderNum ="450")
    private String f3_i6_29_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.29/59.量角器/具体记录",orderNum ="451")
    private String f3_i6_29_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.29/59.量角器/提示回答",orderNum ="452")
    private String f3_i6_29_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.29/59.量角器/提示具体记录",orderNum ="453")
    private String f3_i6_29_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.29/59.量角器/提示请选择",orderNum ="454")
    private String f3_i6_29_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.30/60.算盘/回答",orderNum ="455")
    private String f3_i6_30_1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.30/60.算盘/具体记录",orderNum ="456")
    private String f3_i6_30_2;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.30/60.算盘/提示回答",orderNum ="457")
    private String f3_i6_30_3;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.30/60.算盘/提示具体记录",orderNum ="458")
    private String f3_i6_30_4;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.30/60.算盘/提示请选择",orderNum ="459")
    private String f3_i6_30_5;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.31/总计1",orderNum ="460")
    private String f3_i6_s1;
    @Excel(name = "认知障碍评定表/I6 波士顿命名测验/I6.31/总计2",orderNum ="461")
    private String f3_i6_s3;
    @Excel(name = "认知障碍评定表/I7延迟回忆/胳膊",orderNum ="462")
    private String f3_i7_1_1;
    @Excel(name = "认知障碍评定表/I7延迟回忆/耳朵",orderNum ="463")
    private String f3_i7_1_2;
    @Excel(name = "认知障碍评定表/I7延迟回忆/眼睛",orderNum ="464")
    private String f3_i7_1_3;
    @Excel(name = "认知障碍评定表/I7延迟回忆/猫",orderNum ="465")
    private String f3_i7_1_4;
    @Excel(name = "认知障碍评定表/I7延迟回忆/狗",orderNum ="466")
    private String f3_i7_1_5;
    @Excel(name = "认知障碍评定表/I7延迟回忆/马",orderNum ="467")
    private String f3_i7_1_6;
    @Excel(name = "认知障碍评定表/I7延迟回忆/斧子",orderNum ="468")
    private String f3_i7_1_7;
    @Excel(name = "认知障碍评定表/I7延迟回忆/锤子",orderNum ="469")
    private String f3_i7_1_8;
    @Excel(name = "认知障碍评定表/I7延迟回忆/刀子",orderNum ="470")
    private String f3_i7_1_9;
    @Excel(name = "认知障碍评定表/I7延迟回忆/床",orderNum ="471")
    private String f3_i7_1_10;
    @Excel(name = "认知障碍评定表/I7延迟回忆/椅子",orderNum ="472")
    private String f3_i7_1_11;
    @Excel(name = "认知障碍评定表/I7延迟回忆/钟",orderNum ="473")
    private String f3_i7_1_12;
    @Excel(name = "认知障碍评定表/I7延迟回忆/飞机",orderNum ="474")
    private String f3_i7_1_13;
    @Excel(name = "认知障碍评定表/I7延迟回忆/轿车",orderNum ="475")
    private String f3_i7_1_14;
    @Excel(name = "认知障碍评定表/I7延迟回忆/自行车",orderNum ="476")
    private String f3_i7_1_15;
    @Excel(name = "认知障碍评定表/I7延迟回忆/正确回忆个数",orderNum ="477")
    private String f3_i7_2_1;
    @Excel(name = "认知障碍评定表/I7延迟回忆/插入单词记录",orderNum ="478")
    private String f3_i7_2_2;
    @Excel(name = "认知障碍评定表/I7延迟回忆/插入数",orderNum ="479")
    private String f3_i7_2_3;
    @Excel(name = "认知障碍评定表/I7延迟回忆/重复数",orderNum ="480")
    private String f3_i7_2_4;
    @Excel(name = "认知障碍评定表/I7延迟回忆/记忆策略",orderNum ="481")
    private String f3_i7_2_5;
    @Excel(name = "认知障碍评定表/I8线索回忆/1 身体类",orderNum ="482")
    private String f3_i8_1_1;
    @Excel(name = "认知障碍评定表/I8线索回忆/2 动物类",orderNum ="483")
    private String f3_i8_1_2;
    @Excel(name = "认知障碍评定表/I8线索回忆/3 工具类",orderNum ="484")
    private String f3_i8_1_3;
    @Excel(name = "认知障碍评定表/I8线索回忆/4 家具类",orderNum ="485")
    private String f3_i8_1_4;
    @Excel(name = "认知障碍评定表/I8线索回忆/6 可回忆的个数",orderNum ="486")
    private String f3_i8_1_6;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/1 镜子",orderNum ="487")
    private String f3_i9_1_1;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/2 嘴唇",orderNum ="488")
    private String f3_i9_1_2;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/3 锤子",orderNum ="489")
    private String f3_i9_2_1;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/4 树",orderNum ="490")
    private String f3_i9_1_3;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/5 刀子",orderNum ="491")
    private String f3_i9_2_2;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/6 胳膊",orderNum ="492")
    private String f3_i9_2_3;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/7 蜡烛",orderNum ="493")
    private String f3_i9_1_4;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/8 鼻子",orderNum ="494")
    private String f3_i9_1_5;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/9 摩托车",orderNum ="495")
    private String f3_i9_1_6;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/10 太阳",orderNum ="496")
    private String f3_i9_1_7;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/11 斧子",orderNum ="497")
    private String f3_i9_2_4;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/12 卡车",orderNum ="498")
    private String f3_i9_1_8;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/13 钟",orderNum ="499")
    private String f3_i9_2_5;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/14 眼睛",orderNum ="500")
    private String f3_i9_2_6;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/15 椅子",orderNum ="501")
    private String f3_i9_2_7;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/16 鱼",orderNum ="502")
    private String f3_i9_1_9;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/17 飞机",orderNum ="503")
    private String f3_i9_2_8;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/18 耳朵",orderNum ="504")
    private String f3_i9_2_9;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/19 乌龟",orderNum ="505")
    private String f3_i9_1_10;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/20 自行车",orderNum ="506")
    private String f3_i9_2_10;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/21 马",orderNum ="507")
    private String f3_i9_2_11;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/22 蛇",orderNum ="508")
    private String f3_i9_1_11;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/23 大腿",orderNum ="509")
    private String f3_i9_1_12;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/24 板凳",orderNum ="510")
    private String f3_i9_1_13;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/25 狗",orderNum ="511")
    private String f3_i9_2_12;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/26 公共汽车",orderNum ="512")
    private String f3_i9_1_14;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/27 桌子",orderNum ="513")
    private String f3_i9_1_15;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/28 床",orderNum ="514")
    private String f3_i9_2_13;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/29 猫",orderNum ="515")
    private String f3_i9_2_14;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/30 轿车",orderNum ="516")
    private String f3_i9_2_15;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/I9.1 非阴影的“是”的个数",orderNum ="517")
    private String f3_i9_s_2;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/I9.2 阴影的“是”的个数",orderNum ="518")
    private String f3_i9_s_1;
    @Excel(name = "认知障碍评定表/I9长时延迟再认/I9.1 减去 I9.2",orderNum ="519")
    private String f3_i9_s_3;
    @Excel(name = "认知障碍评定表/I10受试合作性评分/受试合作性评分",orderNum ="520")
    private String f3_i10_1_1;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.1妄想/有无",orderNum ="521")
    private String f3_j1_1_1;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.1妄想/频率",orderNum ="522")
    private String f3_j1_1_2;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.1妄想/严重程度",orderNum ="523")
    private String f3_j1_1_3;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.1妄想/频率×严重程度",orderNum ="524")
    private String f3_j1_1_4;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.1妄想/使照料者苦恼程度",orderNum ="525")
    private String f3_j1_1_5;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.2幻觉/有无",orderNum ="526")
    private String f3_j1_2_1;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.2幻觉/频率",orderNum ="527")
    private String f3_j1_2_2;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.21幻觉/严重程度",orderNum ="528")
    private String f3_j1_2_3;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.2幻觉/频率×严重程度",orderNum ="529")
    private String f3_j1_2_4;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.2幻觉/使照料者苦恼程度",orderNum ="530")
    private String f3_j1_2_5;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.3激越/攻击性/有无",orderNum ="531")
    private String f3_j1_3_1;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.3激越/攻击性/频率",orderNum ="532")
    private String f3_j1_3_2;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.3激越/攻击性/严重程度",orderNum ="533")
    private String f3_j1_3_3;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.3激越/攻击性/频率×严重程度",orderNum ="534")
    private String f3_j1_3_4;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.3激越/攻击性/使照料者苦恼程度",orderNum ="535")
    private String f3_j1_3_5;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.4抑郁/心境恶劣/有无",orderNum ="536")
    private String f3_j1_4_1;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.4抑郁/心境恶劣/频率",orderNum ="537")
    private String f3_j1_4_2;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.4抑郁/心境恶劣/严重程度",orderNum ="538")
    private String f3_j1_4_3;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.4抑郁/心境恶劣/频率×严重程度",orderNum ="539")
    private String f3_j1_4_4;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.4抑郁/心境恶劣/使照料者苦恼程度",orderNum ="540")
    private String f3_j1_4_5;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.5焦虑/有无",orderNum ="541")
    private String f3_j1_5_1;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.5焦虑/频率",orderNum ="542")
    private String f3_j1_5_2;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.3焦虑/严重程度",orderNum ="543")
    private String f3_j1_5_3;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.5焦虑/频率×严重程度",orderNum ="544")
    private String f3_j1_5_4;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.5焦虑/使照料者苦恼程度",orderNum ="545")
    private String f3_j1_5_5;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.6欣快/有无",orderNum ="546")
    private String f3_j1_6_1;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.6欣快/频率",orderNum ="547")
    private String f3_j1_6_2;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.6欣快/严重程度",orderNum ="548")
    private String f3_j1_6_3;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.6欣快/频率×严重程度",orderNum ="549")
    private String f3_j1_6_4;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.6欣快/使照料者苦恼程度",orderNum ="550")
    private String f3_j1_6_5;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.7情感淡漠/有无",orderNum ="551")
    private String f3_j1_7_1;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.7情感淡漠/频率",orderNum ="552")
    private String f3_j1_7_2;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.7情感淡漠/严重程度",orderNum ="553")
    private String f3_j1_7_3;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.7/频率×严重程度",orderNum ="554")
    private String f3_j1_7_4;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.7情感淡漠/使照料者苦恼程度",orderNum ="555")
    private String f3_j1_7_5;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.8脱抑制/有无",orderNum ="556")
    private String f3_j1_8_1;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.8脱抑制/频率",orderNum ="557")
    private String f3_j1_8_2;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.8脱抑制/严重程度",orderNum ="558")
    private String f3_j1_8_3;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.8脱抑制/频率×严重程度",orderNum ="559")
    private String f3_j1_8_4;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.8/使照料者苦恼程度",orderNum ="560")
    private String f3_j1_8_5;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.9易激惹/有无",orderNum ="561")
    private String f3_j1_9_1;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.9易激惹/频率",orderNum ="562")
    private String f3_j1_9_2;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.9易激惹/严重程度",orderNum ="563")
    private String f3_j1_9_3;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.9易激惹/频率×严重程度",orderNum ="564")
    private String f3_j1_9_4;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.9易激惹/使照料者苦恼程度",orderNum ="565")
    private String f3_j1_9_5;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.10异常运动行为/有无",orderNum ="566")
    private String f3_j1_10_1;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.10异常运动行为/频率",orderNum ="567")
    private String f3_j1_10_2;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.10异常运动行为/严重程度",orderNum ="568")
    private String f3_j1_10_3;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.10异常运动行为/频率×严重程度",orderNum ="569")
    private String f3_j1_10_4;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.10异常运动行为/使照料者苦恼程度",orderNum ="570")
    private String f3_j1_10_5;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.11睡眠/夜间行为/有无",orderNum ="571")
    private String f3_j1_11_1;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.11睡眠/夜间行为/频率",orderNum ="572")
    private String f3_j1_11_2;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.11睡眠/夜间行为/严重程度",orderNum ="573")
    private String f3_j1_11_3;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.11睡眠/夜间行为/频率×严重程度",orderNum ="574")
    private String f3_j1_11_4;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.11睡眠/夜间行为/使照料者苦恼程度",orderNum ="575")
    private String f3_j1_11_5;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.12食欲和进食障碍/有无",orderNum ="576")
    private String f3_j1_12_1;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.12食欲和进食障碍/频率",orderNum ="577")
    private String f3_j1_12_2;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.12食欲和进食障碍/严重程度",orderNum ="578")
    private String f3_j1_12_3;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.12食欲和进食障碍/频率×严重程度",orderNum ="579")
    private String f3_j1_12_4;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.12食欲和进食障碍/使照料者苦恼程度",orderNum ="580")
    private String f3_j1_12_5;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.13总分/有无",orderNum ="581")
    private String f3_j1s_1;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.13总分/频率",orderNum ="582")
    private String f3_j1s_2;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.13总分/严重程度",orderNum ="583")
    private String f3_j1s_3;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.13总分/频率×严重程度",orderNum ="584")
    private String f3_j1s_4;
    @Excel(name = "认知障碍评定表/J1神经精神问卷/J1.13总分/使照料者苦恼程度",orderNum ="585")
    private String f3_j1s_5;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.1 你对生活基本上满意吗",orderNum ="586")
    private String f3_j2_1;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.2 你是否已经放弃了许多活动与兴趣",orderNum ="587")
    private String f3_j2_2;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.3 你是否觉得生活空虚",orderNum ="588")
    private String f3_j2_3;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.4 你是否常感到厌倦",orderNum ="589")
    private String f3_j2_4;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.5 你觉得未来有希望吗",orderNum ="590")
    private String f3_j2_5;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.6 你是否因为脑子里一些想法摆脱不掉而烦恼？",orderNum ="591")
    private String f3_j2_6;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.7 你是否大部分时间精力充沛",orderNum ="592")
    private String f3_j2_7;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.8 你是否害怕会有不幸的事情落到你头上",orderNum ="593")
    private String f3_j2_8;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.9 你是否大部分时间感到幸福",orderNum ="594")
    private String f3_j2_9;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.10 你是否常感到孤立无援",orderNum ="595")
    private String f3_j2_10;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.11 你是否经常坐立不安，心烦意乱",orderNum ="596")
    private String f3_j2_11;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.12 你是否希望呆在家里而不愿去做些新鲜事",orderNum ="597")
    private String f3_j2_12;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.13 你是否常常担心将来",orderNum ="598")
    private String f3_j2_13;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.14 你是否觉得记忆力比以前差",orderNum ="599")
    private String f3_j2_14;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.15 你觉得现在活得很惬意吗",orderNum ="600")
    private String f3_j2_15;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.16 你是否常感到心情沉重、郁闷",orderNum ="601")
    private String f3_j2_16;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.17 你是否觉得象现在这样活着毫无意义",orderNum ="602")
    private String f3_j2_17;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.18 你是否总为过去的事忧愁",orderNum ="603")
    private String f3_j2_18;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.19 你觉得生活很令人兴奋吗",orderNum ="604")
    private String f3_j2_19;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.20 你开始一件新的工作很困难吗",orderNum ="605")
    private String f3_j2_20;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.21 你觉得生活充满活力吗",orderNum ="606")
    private String f3_j2_21;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.22 你是否觉得你的处境已毫无希望",orderNum ="607")
    private String f3_j2_22;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.23 你是否觉得大多数人比你强得多",orderNum ="608")
    private String f3_j2_23;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.24 你是否常为一些小事伤心",orderNum ="609")
    private String f3_j2_24;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.25 你是否常觉得想哭",orderNum ="610")
    private String f3_j2_25;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.26 你集中精力有困难吗",orderNum ="611")
    private String f3_j2_26;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.27 你早晨起来很快活吗",orderNum ="612")
    private String f3_j2_27;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.28 你希望避开聚会吗",orderNum ="613")
    private String f3_j2_28;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.29 你做决定很容易吗",orderNum ="614")
    private String f3_j2_29;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.30 你的头脑象往常一样清晰吗",orderNum ="615")
    private String f3_j2_30;
    @Excel(name = "认知障碍评定表/J2老年抑郁量表/J2.31 总分",orderNum ="616")
    private String f3_j2s;
    @Excel(name = "认知障碍评定表/K1日常生活能力量表/K1.1 吃饭",orderNum ="617")
    private String f3_k1_1;
    @Excel(name = "认知障碍评定表/K1日常生活能力量表/K1.2 穿脱衣服",orderNum ="618")
    private String f3_k1_2;
    @Excel(name = "认知障碍评定表/K1日常生活能力量表/K1.3 洗漱",orderNum ="619")
    private String f3_k1_3;
    @Excel(name = "认知障碍评定表/K1日常生活能力量表/K1.4 上下床、坐下或站起",orderNum ="620")
    private String f3_k1_4;
    @Excel(name = "认知障碍评定表/K1日常生活能力量表/K1.5 室内走动",orderNum ="621")
    private String f3_k1_5;
    @Excel(name = "认知障碍评定表/K1日常生活能力量表/K1.6 上厕所",orderNum ="622")
    private String f3_k1_6;
    @Excel(name = "认知障碍评定表/K1日常生活能力量表/K1.7 大小便控制",orderNum ="623")
    private String f3_k1_7;
    @Excel(name = "认知障碍评定表/K1日常生活能力量表/K1.8 洗澡",orderNum ="624")
    private String f3_k1_8;
    @Excel(name = "认知障碍评定表/K1日常生活能力量表/K1.9 自己搭乘公共汽车",orderNum ="625")
    private String f3_k1_9;
    @Excel(name = "认知障碍评定表/K1日常生活能力量表/K1.10 在住地附近活动",orderNum ="626")
    private String f3_k1_10;
    @Excel(name = "认知障碍评定表/K1日常生活能力量表/K1.11 自己做饭",orderNum ="627")
    private String f3_k1_11;
    @Excel(name = "认知障碍评定表/K1日常生活能力量表/K1.12 吃药",orderNum ="628")
    private String f3_k1_12;
    @Excel(name = "认知障碍评定表/K1日常生活能力量表/K1.13 一般轻家务",orderNum ="629")
    private String f3_k1_13;
    @Excel(name = "认知障碍评定表/K1日常生活能力量表/K1.14 复杂家务",orderNum ="630")
    private String f3_k1_14;
    @Excel(name = "认知障碍评定表/K1日常生活能力量表/K1.15 洗自己的衣服",orderNum ="631")
    private String f3_k1_15;
    @Excel(name = "认知障碍评定表/K1日常生活能力量表/K1.16 剪脚趾甲",orderNum ="632")
    private String f3_k1_16;
    @Excel(name = "认知障碍评定表/K1日常生活能力量表/K1.17 购物",orderNum ="633")
    private String f3_k1_17;
    @Excel(name = "认知障碍评定表/K1日常生活能力量表/K1.18 使用电话",orderNum ="634")
    private String f3_k1_18;
    @Excel(name = "认知障碍评定表/K1日常生活能力量表/K1.19 管理个人钱财",orderNum ="635")
    private String f3_k1_19;
    @Excel(name = "认知障碍评定表/K1日常生活能力量表/K1.20 独自在家",orderNum ="636")
    private String f3_k1_20;
    @Excel(name = "认知障碍评定表/K1日常生活能力量表/K1.21 总分",orderNum ="637")
    private String f3_k1s_1;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/1. 他／她有记忆或思维的问题吗",orderNum ="638")
    private String f3_k2_1_1;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/1a. 假如是，这个问题是经常的吗",orderNum ="639")
    private String f3_k2_1_2;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/2. 他／她能回忆起最近发生的事情吗",orderNum ="640")
    private String f3_k2_1_3;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/3. 他／她能记住短的购物清单吗",orderNum ="641")
    private String f3_k2_1_4;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/4. 在过去的一年中他／她记忆力有减退吗",orderNum ="642")
    private String f3_k2_1_5;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/5. 他/她的记忆状况是否几年前就严重到妨碍他/她的日常活动能力",orderNum ="643")
    private String f3_k2_1_6;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/6. 他／她会完全忘记几周内的大事吗",orderNum ="644")
    private String f3_k2_1_7;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/7. 他／她经常忘记重要事情的确切细节吗",orderNum ="645")
    private String f3_k2_1_8;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/8. 他／她经常完全忘记很早以前的重要事情吗",orderNum ="646")
    private String f3_k2_1_9;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/9. 告诉我最近生活中他／她应该记得的一些事情，请详细描述事件发生的地点，开始、持续和结束时间，参加者以及他们（包括受试者）是如何到达现场的/一周以内的事情",orderNum ="647")
    private String f3_k2_1_10;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/9. 告诉我最近生活中他／她应该记得的一些事情，请详细描述事件发生的地点，开始、持续和结束时间，参加者以及他们（包括受试者）是如何到达现场的/一月以内的事件",orderNum ="648")
    private String f3_k2_1_11;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/10. 他／她是什么时候出生的",orderNum ="649")
    private String f3_k2_1_12;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/11. 他／她在什么地方出生的",orderNum ="650")
    private String f3_k2_1_13;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/12. 他／她最后就读的学校是/名称",orderNum ="651")
    private String f3_k2_1_14;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/12. 他／她最后就读的学校是/地点",orderNum ="652")
    private String f3_k2_1_15;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/12. 他／她最后就读的学校是/年级",orderNum ="653")
    private String f3_k2_1_16;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/13. 他／她主要的工作是什么？假如没有，配偶的主要工作是什么",orderNum ="654")
    private String f3_k2_1_17;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/14. 他／她最后的主要工作是什么？假如没有，配偶最后的主要工作是什么?",orderNum ="655")
    private String f3_k2_1_18;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/15. 他／她（或配偶）何时退休的？为什么",orderNum ="656")
    private String f3_k2_1_19;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/1. 当月的日期",orderNum ="657")
    private String f3_k2_2_1;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/2. 月份",orderNum ="658")
    private String f3_k2_2_2;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/3. 年份",orderNum ="659")
    private String f3_k2_2_3;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/4. 星期几",orderNum ="660")
    private String f3_k2_2_4;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/5. 他／她判断时间关系有困难吗",orderNum ="661")
    private String f3_k2_2_5;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/6. 在熟悉的街区，他／她是否能找到自己想去的地方",orderNum ="662")
    private String f3_k2_2_6;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/7. 在居住区以外的地方，他／她是否能从一个地方到另一个地方",orderNum ="663")
    private String f3_k2_2_7;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/8. 在室内，他／她是否能找到自己想去的地方",orderNum ="664")
    private String f3_k2_2_8;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/1. 总的来说，假如您现在必须评定他／她解决问题的能力，请你考虑以下答案哪一种最适合",orderNum ="665")
    private String f3_k2_3_1;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/3. 评定他／她处理复杂财务或生意交易的能力",orderNum ="666")
    private String f3_k2_3_3;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/4. 他／她是否能处理家庭中发生的紧急情况",orderNum ="667")
    private String f3_k2_3_4;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/5. 他／她能理解所处境况或别人对某一问题的解释吗?",orderNum ="668")
    private String f3_k2_3_6;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/6. 在社交场合或与他人交往时，他／她的行为适当吗?",orderNum ="669")
    private String f3_k2_3_7;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/1. 他／她仍在工作吗",orderNum ="670")
    private String f3_k2_4_1;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/2. 记忆或思维障碍是他/她决定退休的原因吗",orderNum ="671")
    private String f3_k2_4_2;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/3. 因为记忆或思维障碍，他/她在工作中有明显的困难吗",orderNum ="672")
    private String f3_k2_4_3;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/4. 他/她过去骑自行车吗",orderNum ="673")
    private String f3_k2_4_4;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/5. 他/她现在骑自行车吗",orderNum ="674")
    private String f3_k2_4_5;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/6. 如果否，是否是因为记忆力或思维问题",orderNum ="675")
    private String f3_k2_4_6;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/7. 假如他/她仍坚持骑自行车，是否会因为思维能力不佳而出现问题或危险",orderNum ="676")
    private String f3_k2_4_7;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/8. 他／她能独立购买需要的东西吗",orderNum ="677")
    private String f3_k2_4_8;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/9. 他／她在家庭以外能独立地进行活动吗",orderNum ="678")
    private String f3_k2_4_9;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/10. 他／她是否经常被带去参加家庭以外的社会活动",orderNum ="679")
    private String f3_k2_4_10;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/10. 他／她是否经常被带去参加家庭以外的社会活动否,为什么？",orderNum ="680")
    private String f3_k2_4_11;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/11. 不经意的观察会觉得他/她的行为异常吗",orderNum ="681")
    private String f3_k2_4_12;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/12. 他／她能很好地参加社交活动吗",orderNum ="682")
    private String f3_k2_4_13;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/13. 以上是否能够得到足够的信息来评定受试者的社会活动缺损程度",orderNum ="683")
    private String f3_k2_4_14;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/14. 探亲访友、政治活动、行业组织如各种协会、社会俱乐部、服务机构、教育项目等",orderNum ="684")
    private String f3_k2_4_15;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/1a. 他/她做家务的能力出现了什么变化?",orderNum ="685")
    private String f3_k2_5_1;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/1b. 他／她还能把哪些事情做好",orderNum ="686")
    private String f3_k2_5_2;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/2a. 他／她从事业余爱好的能力有什么改变",orderNum ="687")
    private String f3_k2_5_3;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/2b. 他／她还能把哪些爱好的事情做好",orderNum ="688")
    private String f3_k2_5_4;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/3. 有哪些家务和爱好他/她再也无法做好了",orderNum ="689")
    private String f3_k2_5_5;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/4. 患者做家务的能力",orderNum ="690")
    private String f3_k2_5_6;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/4. 患者做家务的能力请描述",orderNum ="691")
    private String f3_k2_5_7;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/5. 他／她做家务的能力以下哪个答案最合适",orderNum ="692")
    private String f3_k2_5_8;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/6. 以上是否能够得到足够的信息来评定受试者的家务与爱好损害的程度",orderNum ="693")
    private String f3_k2_5_9;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/6. 以上是否能够得到足够的信息来评定受试者的家务与爱好损害的程度/进一步探讨",orderNum ="694")
    private String f3_k2_5_10;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/（6）询问知情者有关受试者个人生活自理能力/1. 穿衣",orderNum ="695")
    private String f3_k2_6_1;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/（6）询问知情者有关受试者个人生活自理能力/2. 清洁与修饰",orderNum ="696")
    private String f3_k2_6_2;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/（6）询问知情者有关受试者个人生活自理能力/3. 吃饭",orderNum ="697")
    private String f3_k2_6_3;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/1）询问知情者/（6）询问知情者有关受试者个人生活自理能力/4. 括约肌控制",orderNum ="698")
    private String f3_k2_6_4;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（1）询问受试者的记忆问题/1. 你在记忆或思维方面有问题吗",orderNum ="699")
    private String f3_k2_2_1_1;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（1）询问受试者的记忆问题/2. 刚才你的（配偶，子女等）告诉我一些你最近经历的事一周以内的事件",orderNum ="700")
    private String f3_k2_2_1_2;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（1）询问受试者的记忆问题/2. 刚才你的（配偶，子女等）告诉我一些你最近经历的事一周以内的事件",orderNum ="701")
    private String f3_k2_2_1_3;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（1）询问受试者的记忆问题/2. 刚才你的（配偶，子女等）告诉我一些你最近经历的事一月以内的事件",orderNum ="702")
    private String f3_k2_2_1_4;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（1）询问受试者的记忆问题/2. 刚才你的（配偶，子女等）告诉我一些你最近经历的事一月以内的事件",orderNum ="703")
    private String f3_k2_2_1_5;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（1）询问受试者的记忆问题/3. 我现在说一个姓名和地址，请您记住/第一遍",orderNum ="704")
    private String f3_k2_2_1_6;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（1）询问受试者的记忆问题/3. 我现在说一个姓名和地址，请您记住/第一遍",orderNum ="705")
    private String f3_k2_2_1_7;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（1）询问受试者的记忆问题/3. 我现在说一个姓名和地址，请您记住/第三遍",orderNum ="706")
    private String f3_k2_2_1_8;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（1）询问受试者的记忆问题/4. 你是什么时候出生的",orderNum ="707")
    private String f3_k2_2_1_9;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（1）询问受试者的记忆问题/5. 你在什么地方出生的",orderNum ="708")
    private String f3_k2_2_1_10;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（1）询问受试者的记忆问题/6. 你最后就读的学校是/名称",orderNum ="709")
    private String f3_k2_2_1_11;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（1）询问受试者的记忆问题/6. 你最后就读的学校是/地点",orderNum ="710")
    private String f3_k2_2_1_12;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（1）询问受试者的记忆问题/6. 你最后就读的学校是/年级",orderNum ="711")
    private String f3_k2_2_1_13;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（1）询问受试者的记忆问题/7. 你主要的工作是什么？假如没有工作，配偶的主要工作是什么?",orderNum ="712")
    private String f3_k2_2_1_14;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（1）询问受试者的记忆问题/8. 你最后的主要工作是什么？假如没有工作，配偶最后的主要工作是什么",orderNum ="713")
    private String f3_k2_2_1_15;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（1）询问受试者的记忆问题/9. 你（或配偶）何时退休的？为什么?",orderNum ="714")
    private String f3_k2_2_1_16;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（1）询问受试者的记忆问题/10. 请重复我刚才让您记住的名称和地址",orderNum ="715")
    private String f3_k2_2_1_17;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（2）询问受试者的定向问题/1. 今天是几号",orderNum ="716")
    private String f3_k2_2_2_1;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（2）询问受试者的定向问题/2. 今天是星期几",orderNum ="717")
    private String f3_k2_2_2_2;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（2）询问受试者的定向问题/3. 现在是几月份",orderNum ="718")
    private String f3_k2_2_2_3;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（2）询问受试者的定向问题/4. 今年是哪一年",orderNum ="719")
    private String f3_k2_2_2_4;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（2）询问受试者的定向问题/5. 这个地方的名称是什么",orderNum ="720")
    private String f3_k2_2_2_5;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（2）询问受试者的定向问题/6. 我们住在哪个城市或城镇?",orderNum ="721")
    private String f3_k2_2_2_6;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（2）询问受试者的定向问题/7. 现在几点了",orderNum ="722")
    private String f3_k2_2_2_7;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（2）询问受试者的定向问题/8. 受试者知道陪他／她来的人是谁吗",orderNum ="723")
    private String f3_k2_2_2_8;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（3）询问受试者有关判断和解决问题的能力/1. 萝卜……菜花",orderNum ="724")
    private String f3_k2_2_3_1;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（3）询问受试者有关判断和解决问题的能力/2. 书桌……书架",orderNum ="725")
    private String f3_k2_2_3_2;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（3）询问受试者有关判断和解决问题的能力/3. 谎言……错误",orderNum ="726")
    private String f3_k2_2_3_3;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（3）询问受试者有关判断和解决问题的能力/4. 河流……运河",orderNum ="727")
    private String f3_k2_2_3_4;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（3）询问受试者有关判断和解决问题的能力/5. 1元等于多少个5分?",orderNum ="728")
    private String f3_k2_2_3_5;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（3）询问受试者有关判断和解决问题的能力/6. 六元七角五分等于多少个二角五分",orderNum ="729")
    private String f3_k2_2_3_6;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（3）询问受试者有关判断和解决问题的能力/7. 从20减去3，再从每一个得数连续减3，一直减下去",orderNum ="730")
    private String f3_k2_2_3_7;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（3）询问受试者有关判断和解决问题的能力/8. 当你到达一个陌生的城市，你如何找到你想到达的一个单位",orderNum ="731")
    private String f3_k2_2_3_8;
    @Excel(name = "认知障碍评定表/K2临床痴呆评定量表/2）询问受试者/（3）询问受试者有关判断和解决问题的能力/9. 受试者对自身生活能力减退和处境以及对他",orderNum ="732")
    private String f3_k2_2_3_9;
    @Excel(name = "认知障碍评定表/K2CDR整体评分/K2.1 记忆力",orderNum ="733")
    private String f3_cdr_1;
    @Excel(name = "认知障碍评定表/K2CDR整体评分/K2.2 定向力",orderNum ="734")
    private String f3_cdr_2;
    @Excel(name = "认知障碍评定表/K2CDR整体评分/K2.3 判断与解决问题的能力",orderNum ="735")
    private String f3_cdr_3;
    @Excel(name = "认知障碍评定表/K2CDR整体评分/K2.4 社会事务",orderNum ="736")
    private String f3_cdr_4;
    @Excel(name = "认知障碍评定表/K2CDR整体评分/K2.5 家务与业余爱好",orderNum ="737")
    private String f3_cdr_5;
    @Excel(name = "认知障碍评定表/K2CDR整体评分/K2.6 个人自理能力",orderNum ="738")
    private String f3_cdr_6;
    @Excel(name = "认知障碍评定表/K2CDR整体评分/K2.7 CDR各域总分",orderNum ="739")
    private String f3_cdrs_1;
    @Excel(name = "认知障碍评定表/K2CDR整体评分/K2.8 CDR整体评分",orderNum ="740")
    private String f3_cdrs_2;
    @Excel(name = "认知障碍报告表/B现病史/B1.1 记忆障碍",orderNum ="741")
    private String f4_b1_1;
    @Excel(name = "认知障碍报告表/B现病史/B1.2 语言障碍",orderNum ="742")
    private String f4_b1_2;
    @Excel(name = "认知障碍报告表/B现病史/B1.3 执行功能障碍",orderNum ="743")
    private String f4_b1_3;
    @Excel(name = "认知障碍报告表/B现病史/B1.4 空间技能下降",orderNum ="744")
    private String f4_b1_4;
    @Excel(name = "认知障碍报告表/B现病史/B1.5 性格改变",orderNum ="745")
    private String f4_b1_5;
    @Excel(name = "认知障碍报告表/B现病史/B1.6 行为异常",orderNum ="746")
    private String f4_b1_6;
    @Excel(name = "认知障碍报告表/B现病史/B1.7 幻听幻视",orderNum ="747")
    private String f4_b1_7;
    @Excel(name = "认知障碍报告表/B现病史/B1.8 癫痫、肌阵挛",orderNum ="748")
    private String f4_b1_7_1;
    @Excel(name = "认知障碍报告表/B现病史/B1.9 运动障碍，如共济失调、帕金森样运动障碍、不自主运动",orderNum ="749")
    private String f4_b1_8;
    @Excel(name = "认知障碍报告表/B现病史/B1.10 症状补充说明",orderNum ="750")
    private String f4_b1_9;
    @Excel(name = "认知障碍报告表/B现病史/B1.10 症状补充说明请具体描述",orderNum ="751")
    private String f4_b1_10;
    @Excel(name = "认知障碍报告表/B现病史/B1.11 最早期的症状出现的时间",orderNum ="752")
    private String f4_b1_11;
    @Excel(name = "认知障碍报告表/B现病史/B1.12 距今有多久了",orderNum ="753")
    private String f4_b1_12;
    @Excel(name = "认知障碍报告表/B现病史/B2 认知症状起病方式",orderNum ="754")
    private String f4_b2_1;
    @Excel(name = "认知障碍报告表/B现病史/B3 症状发展变化的形式",orderNum ="755")
    private String f4_b3_1;
    @Excel(name = "认知障碍报告表/B现病史/B4 病史描述",orderNum ="756")
    private String f4_b4_1;
    @Excel(name = "认知障碍报告表/C生活习惯/C1 吸烟史",orderNum ="757")
    private String f4_c1_1_1;
    @Excel(name = "认知障碍报告表/C生活习惯/C1.1 持续几年",orderNum ="758")
    private String f4_c1_1_2;
    @Excel(name = "认知障碍报告表/C生活习惯/C1.2 平均每日几支",orderNum ="759")
    private String f4_c1_1_3;
    @Excel(name = "认知障碍报告表/C生活习惯/C1.3 是否戒烟",orderNum ="760")
    private String f4_c1_1_4;
    @Excel(name = "认知障碍报告表/C生活习惯/C1.4 戒烟几年",orderNum ="761")
    private String f4_c1_1_5;
    @Excel(name = "认知障碍报告表/C生活习惯/C2 饮酒史",orderNum ="762")
    private String f4_c1_2_1;
    @Excel(name = "认知障碍报告表/C生活习惯/C2.1 持续几年",orderNum ="763")
    private String f4_c1_2_2;
    @Excel(name = "认知障碍报告表/C生活习惯/C2.2 种类",orderNum ="764")
    private String f4_c1_2_3;
    @Excel(name = "认知障碍报告表/C生活习惯/C2.3 平均每日几两白酒/葡萄酒",orderNum ="765")
    private String f4_c1_2_4;
    @Excel(name = "认知障碍报告表/C生活习惯/C2.3 平均每日几毫升啤酒",orderNum ="766")
    private String f4_c1_2_5;
    @Excel(name = "认知障碍报告表/C生活习惯/C2.4 是否戒酒",orderNum ="767")
    private String f4_c1_2_6;
    @Excel(name = "认知障碍报告表/C生活习惯/C2.5 戒酒几年",orderNum ="768")
    private String f4_c1_2_7;
    @Excel(name = "认知障碍报告表/C生活习惯/C3 喝茶/咖啡史",orderNum ="769")
    private String f4_c1_3_1;
    @Excel(name = "认知障碍报告表/C生活习惯/C3.1 持续几年",orderNum ="770")
    private String f4_c1_3_2;
    @Excel(name = "认知障碍报告表/C生活习惯/C3.2 种类",orderNum ="771")
    private String f4_c1_3_3;
    @Excel(name = "认知障碍报告表/C生活习惯/具体名称",orderNum ="772")
    private String f4_c1_3_4;
    @Excel(name = "认知障碍报告表/C生活习惯/C3.3 次数",orderNum ="773")
    private String f4_c1_3_5;
    @Excel(name = "认知障碍报告表/C生活习惯/C3.4 现在是否停止喝茶/咖啡",orderNum ="774")
    private String f4_c1_3_6;
    @Excel(name = "认知障碍报告表/C生活习惯/C3.5 停止喝茶/咖啡几年",orderNum ="775")
    private String f4_c1_3_7;
    @Excel(name = "认知障碍报告表/D家族史/D1 家族史",orderNum ="776")
    private String f4_d1_1;
    @Excel(name = "认知障碍报告表/D家族史/D2 请绘制家系图",orderNum ="777")
    private String f4_d2_img;
    @Excel(name = "认知障碍报告表/D家族史/D3 被试一级亲属中是否有痴呆患者",orderNum ="778")
    private String f4_d3_1_0;
    @Excel(name = "认知障碍报告表/D家族史/D3.1 请选择哪些一级亲属患有痴呆",orderNum ="779")
    private String f4_d3_1_1;
    @Excel(name = "认知障碍报告表/D家族史/D3.2 共有几位一级亲属患有痴呆",orderNum ="780")
    private String f4_d3_1_2;
    @Excel(name = "认知障碍报告表/D家族史/D3.3 编号说明亲属",orderNum ="781")
    private String f4_d3_1_3_0_1;
    @Excel(name = "认知障碍报告表/D家族史/D3.3 编号说明编号",orderNum ="782")
    private String f4_d3_1_3_0_2;
    @Excel(name = "认知障碍报告表/D家族史/D3.3.1 出现症状的年龄",orderNum ="783")
    private String f4_d3_1_3_1;
    @Excel(name = "认知障碍报告表/D家族史/D3.3.2 主要症状/1.记忆障碍",orderNum ="784")
    private String f4_d3_1_3_2_1;
    @Excel(name = "认知障碍报告表/D家族史/D3.3.2 主要症状/2.语言障碍",orderNum ="785")
    private String f4_d3_1_3_2_2;
    @Excel(name = "认知障碍报告表/D家族史/D3.3.2 主要症状/3.执行功能和处理具体事务的能力下降",orderNum ="786")
    private String f4_d3_1_3_2_3;
    @Excel(name = "认知障碍报告表/D家族史/D3.3.2 主要症状/4.空间技能下降",orderNum ="787")
    private String f4_d3_1_3_2_4;
    @Excel(name = "认知障碍报告表/D家族史/D3.3.2 主要症状/5.性格改变",orderNum ="788")
    private String f4_d3_1_3_2_5;
    @Excel(name = "认知障碍报告表/D家族史/D3.3.2 主要症状/6.行为异常",orderNum ="789")
    private String f4_d3_1_3_2_6;
    @Excel(name = "认知障碍报告表/D家族史/D3.3.2 主要症状/7.幻觉妄想等精神症状",orderNum ="790")
    private String f4_d3_1_3_2_7;
    @Excel(name = "认知障碍报告表/D家族史/D3.3.2 主要症状/8.癫痫、肌阵挛",orderNum ="791")
    private String f4_d3_1_3_2_8;
    @Excel(name = "认知障碍报告表/D家族史/D3.3.2 主要症状/9.运动障碍,如共济失调/帕金森样运动障碍",orderNum ="792")
    private String f4_d3_1_3_2_9;
    @Excel(name = "认知障碍报告表/D家族史/D3.3.2 主要症状/10.二便障碍",orderNum ="793")
    private String f4_d3_1_3_2_10;
    @Excel(name = "认知障碍报告表/D家族史/D3.3.2 主要症状/11.其他症状",orderNum ="794")
    private String f4_d3_1_3_2_11;
    @Excel(name = "认知障碍报告表/D家族史/D3.3.3与先证者的临床一致性",orderNum ="795")
    private String f4_d3_1_3_3;
    @Excel(name = "认知障碍报告表/D家族史/D3.3.4症状明显影响日常生活的年龄多少岁",orderNum ="796")
    private String f4_d3_1_3_4;
    @Excel(name = "认知障碍报告表/D家族史/D3.3.5是否死亡",orderNum ="797")
    private String f4_d3_1_3_5;
    @Excel(name = "认知障碍报告表/D家族史/死亡年龄",orderNum ="798")
    private String f4_d3_1_3_6;
    @Excel(name = "认知障碍报告表/D家族史/D3.3.7是否伴发其他影响认知功能的疾病",orderNum ="799")
    private String f4_d3_1_3_7;
    @Excel(name = "认知障碍报告表/D家族史/D3.3.7是否伴发其他影响认知功能的疾病具体描述",orderNum ="800")
    private String f4_d3_1_3_7_1;
    @Excel(name = "认知障碍报告表/D家族史/D3.3.8是否能确定是 AD",orderNum ="801")
    private String f4_d3_1_3_8;
    @Excel(name = "认知障碍报告表/D家族史/D4 被试二级亲属中是否有痴呆患者",orderNum ="802")
    private String f4_d4_0;
    @Excel(name = "认知障碍报告表/D家族史/D4.1 请选择哪些二级亲属患有痴呆",orderNum ="803")
    private String f4_d4_1;
    @Excel(name = "认知障碍报告表/D家族史/D4.2 共有几位二级亲属患有痴",orderNum ="804")
    private String f4_d4_2;
    @Excel(name = "认知障碍报告表/D家族史/D4.3.0 亲属",orderNum ="805")
    private String f4_d4_3_0_1;
    @Excel(name = "认知障碍报告表/D家族史/D4.3.0 编号",orderNum ="806")
    private String f4_d4_3_0_2;
    @Excel(name = "认知障碍报告表/D家族史/D4.3.1 出现症状的年龄多少岁",orderNum ="807")
    private String f4_d4_3_1;
    @Excel(name = "认知障碍报告表/D家族史/D4.3.2 主要症状/1.记忆障碍",orderNum ="808")
    private String f4_d4_3_2_1;
    @Excel(name = "认知障碍报告表/D家族史/D4.3.2 主要症状/2.语言障碍",orderNum ="809")
    private String f4_d4_3_2_2;
    @Excel(name = "认知障碍报告表/D家族史/D4.3.2 主要症状/3.执行功能和处理具体事务的能力下降",orderNum ="810")
    private String f4_d4_3_2_3;
    @Excel(name = "认知障碍报告表/D家族史/D4.3.2 主要症状/4.空间技能下降",orderNum ="811")
    private String f4_d4_3_2_4;
    @Excel(name = "认知障碍报告表/D家族史/D4.3.2 主要症状/5.性格改变",orderNum ="812")
    private String f4_d4_3_2_5;
    @Excel(name = "认知障碍报告表/D家族史/D4.3.2 主要症状/6.行为异",orderNum ="813")
    private String f4_d4_3_2_6;
    @Excel(name = "认知障碍报告表/D家族史/D4.3.2 主要症状/7.幻觉妄想等精神症状",orderNum ="814")
    private String f4_d4_3_2_7;
    @Excel(name = "认知障碍报告表/D家族史/D4.3.2 主要症状/8.癫痫、肌阵挛",orderNum ="815")
    private String f4_d4_3_2_8;
    @Excel(name = "认知障碍报告表/D家族史/D4.3.2 主要症状/9.运动障碍",orderNum ="816")
    private String f4_d4_3_2_9;
    @Excel(name = "认知障碍报告表/D家族史/D4.3.2 主要症状/10.二便障碍",orderNum ="817")
    private String f4_d4_3_2_10;
    @Excel(name = "认知障碍报告表/D家族史/D4.3.2 主要症状/11.其他症状",orderNum ="818")
    private String f4_d4_3_2_11;
    @Excel(name = "认知障碍报告表/D家族史/D4.3.2 主要症状/D4.3.3与先证者的临床一致性",orderNum ="819")
    private String f4_d4_3_2_12;
    @Excel(name = "认知障碍报告表/D家族史/D4.3.2 主要症状/D4.3.4症状明显影响日常生活的年龄多少岁",orderNum ="820")
    private String f4_d4_3_2_13;
    @Excel(name = "认知障碍报告表/D家族史/D4.3.2 主要症状/D4.3.5是否死亡",orderNum ="821")
    private String f4_d4_3_2_14;
    @Excel(name = "认知障碍报告表/D家族史/D4.3.2 主要症状/D4.3.5是否死亡死亡年龄",orderNum ="822")
    private String f4_d4_3_2_15;
    @Excel(name = "认知障碍报告表/D家族史/D4.3.2 主要症状/D3.3.7是否伴发其他影响认知功能的疾病",orderNum ="823")
    private String f4_d4_3_2_16;
    @Excel(name = "认知障碍报告表/D家族史/D4.3.2 主要症状/D3.3.7是否伴发其他影响认知功能的疾病具体描述",orderNum ="824")
    private String f4_d4_3_2_17;
    @Excel(name = "认知障碍报告表/D家族史/D4.3.2 主要症状/D4.3.8是否能确定是 AD",orderNum ="825")
    private String f4_d4_3_2_18;
    @Excel(name = "认知障碍报告表/D家族史/D5.1 该被试者是否是家族性 AD/",orderNum ="826")
    private String f4_d5_1;
    @Excel(name = "认知障碍报告表/D家族史/D5.2 累及几代家系成员",orderNum ="827")
    private String f4_d5_2;
    @Excel(name = "认知障碍报告表/D家族史/D5.3 从病史判断，家族中有几位已经发病的成员",orderNum ="828")
    private String f4_d5_3;
    @Excel(name = "认知障碍报告表/D家族史/D5.4 家族出现症状的年龄",orderNum ="829")
    private String f4_d5_4;
    @Excel(name = "认知障碍报告表/D家族史/D5.5 家族的临床症状是否具有相似性",orderNum ="830")
    private String f4_d5_5;
    @Excel(name = "认知障碍报告表/D家族史/D5.6家族主要临床症状/1.记忆障碍",orderNum ="831")
    private String f4_d5_6_1;
    @Excel(name = "认知障碍报告表/D家族史/D5.6家族主要临床症状/2.语言障碍",orderNum ="832")
    private String f4_d5_6_2;
    @Excel(name = "认知障碍报告表/D家族史/D5.6家族主要临床症状/3.执行功能和处理具体事务的能力下降",orderNum ="833")
    private String f4_d5_6_3;
    @Excel(name = "认知障碍报告表/D家族史/D5.6家族主要临床症状/4.空间技能下降",orderNum ="834")
    private String f4_d5_6_4;
    @Excel(name = "认知障碍报告表/D家族史/D5.6家族主要临床症状/5.性格改变",orderNum ="835")
    private String f4_d5_6_5;
    @Excel(name = "认知障碍报告表/D家族史/D5.6家族主要临床症状/6.行为异常",orderNum ="836")
    private String f4_d5_6_6;
    @Excel(name = "认知障碍报告表/D家族史/D5.6家族主要临床症状/7.幻觉妄想等精神症状",orderNum ="837")
    private String f4_d5_6_7;
    @Excel(name = "认知障碍报告表/D家族史/D5.6家族主要临床症状/8.癫痫、肌阵挛",orderNum ="838")
    private String f4_d5_6_8;
    @Excel(name = "认知障碍报告表/D家族史/D5.6家族主要临床症状/9.运动障碍,如共济失调/帕金森样运动障碍",orderNum ="839")
    private String f4_d5_6_9;
    @Excel(name = "认知障碍报告表/D家族史/D5.6家族主要临床症状/10.二便障碍",orderNum ="840")
    private String f4_d5_6_10;
    @Excel(name = "认知障碍报告表/D家族史/D5.6家族主要临床症状/11.其他症状",orderNum ="841")
    private String f4_d5_6_11;
    @Excel(name = "认知障碍报告表/D家族史/D5.7家族成员发生痴呆的年龄/",orderNum ="842")
    private String f4_d5_7;
    @Excel(name = "认知障碍报告表/D家族史/D5.6家族主要临床症状/D5.8家族成员认知症状起病方式",orderNum ="843")
    private String f4_d5_8;
    @Excel(name = "认知障碍报告表/D家族史/D5.9症状发展变化的形式",orderNum ="844")
    private String f4_d5_9;
    @Excel(name = "认知障碍报告表/D家族史/D5.10其他需要补充说明的疾病和情况",orderNum ="845")
    private String f4_d5_10;
    @Excel(name = "认知障碍报告表/E既往史/E1 心脏疾病/E1.1心跳骤停史",orderNum ="846")
    private String f4_e1_1;
    @Excel(name = "认知障碍报告表/E既往史/E1 心脏疾病/病程(年)",orderNum ="847")
    private String f4_e1_2;
    @Excel(name = "认知障碍报告表/E既往史/E1 心脏疾病/药品名称",orderNum ="848")
    private String f4_e1_3;
    @Excel(name = "认知障碍报告表/E既往史/E1 心脏疾病/药物规格",orderNum ="849")
    private String f4_e1_4;
    @Excel(name = "认知障碍报告表/E既往史/E1 心脏疾病/给药方式",orderNum ="850")
    private String f4_e1_5;
    @Excel(name = "认知障碍报告表/E既往史/E1 心脏疾病/给药剂量",orderNum ="851")
    private String f4_e1_6;
    @Excel(name = "认知障碍报告表/E既往史/E1 心脏疾病/开始用药时间",orderNum ="852")
    private String f4_e1_7;
    @Excel(name = "认知障碍报告表/E既往史/E1 心脏疾病/是否规律用药",orderNum ="853")
    private String f4_e1_8;
    @Excel(name = "认知障碍报告表/E既往史/E1 心脏疾病/是否停药",orderNum ="854")
    private String f4_e1_9;
    @Excel(name = "认知障碍报告表/E既往史/E1 心脏疾病/停药时间",orderNum ="855")
    private String f4_e1_10;
    @Excel(name = "认知障碍报告表/E既往史/E1 心脏疾病/疾病控制情况",orderNum ="856")
    private String f4_e1_11;
    @Excel(name = "认知障碍报告表/E既往史/E1.2心绞痛/",orderNum ="857")
    private String f4_e2_1;
    @Excel(name = "认知障碍报告表/E既往史/E1.2心绞痛/病程",orderNum ="858")
    private String f4_e2_2;
    @Excel(name = "认知障碍报告表/E既往史/E1.2心绞痛/药品名称",orderNum ="859")
    private String f4_e2_3;
    @Excel(name = "认知障碍报告表/E既往史/E1.2心绞痛/药物规格",orderNum ="860")
    private String f4_e2_4;
    @Excel(name = "认知障碍报告表/E既往史/E1.2心绞痛/给药剂量",orderNum ="861")
    private String f4_e2_6;
    @Excel(name = "认知障碍报告表/E既往史/E1.2心绞痛/开始用药时间",orderNum ="862")
    private String f4_e2_7;
    @Excel(name = "认知障碍报告表/E既往史/E1.2心绞痛/是否规律用药",orderNum ="863")
    private String f4_e2_8;
    @Excel(name = "认知障碍报告表/E既往史/E1.2心绞痛/是否停药",orderNum ="864")
    private String f4_e2_9;
    @Excel(name = "认知障碍报告表/E既往史/E1.2心绞痛/停药时间",orderNum ="865")
    private String f4_e2_10;
    @Excel(name = "认知障碍报告表/E既往史/E1.2心绞痛/疾病控制情况",orderNum ="866")
    private String f4_e2_11;
    @Excel(name = "认知障碍报告表/E既往史/E1.3心肌梗死/",orderNum ="867")
    private String f4_e3_1;
    @Excel(name = "认知障碍报告表/E既往史/E1.3心肌梗死/病程",orderNum ="868")
    private String f4_e3_2;
    @Excel(name = "认知障碍报告表/E既往史/E1.3心肌梗死/药品名称",orderNum ="869")
    private String f4_e3_3;
    @Excel(name = "认知障碍报告表/E既往史/E1.3心肌梗死/药物规格",orderNum ="870")
    private String f4_e3_4;
    @Excel(name = "认知障碍报告表/E既往史/E1.3心肌梗死/给药方式",orderNum ="871")
    private String f4_e3_5;
    @Excel(name = "认知障碍报告表/E既往史/E1.3心肌梗死/给药剂量",orderNum ="872")
    private String f4_e3_6;
    @Excel(name = "认知障碍报告表/E既往史/E1.3心肌梗死/开始用药时间",orderNum ="873")
    private String f4_e3_7;
    @Excel(name = "认知障碍报告表/E既往史/E1.3心肌梗死/是否规律用药",orderNum ="874")
    private String f4_e3_8;
    @Excel(name = "认知障碍报告表/E既往史/E1.3心肌梗死/是否停药",orderNum ="875")
    private String f4_e3_9;
    @Excel(name = "认知障碍报告表/E既往史/E1.3心肌梗死/停药时间",orderNum ="876")
    private String f4_e3_10;
    @Excel(name = "认知障碍报告表/E既往史/E1.3心肌梗死/v",orderNum ="877")
    private String f4_e3_11;
    @Excel(name = "认知障碍报告表/E既往史/E1.4心房纤颤/",orderNum ="878")
    private String f4_e4_1;
    @Excel(name = "认知障碍报告表/E既往史/E1.4心房纤颤/病程",orderNum ="879")
    private String f4_e4_2;
    @Excel(name = "认知障碍报告表/E既往史/E1.4心房纤颤/药品名称",orderNum ="880")
    private String f4_e4_3;
    @Excel(name = "认知障碍报告表/E既往史/E1.4心房纤颤/药物规格",orderNum ="881")
    private String f4_e4_4;
    @Excel(name = "认知障碍报告表/E既往史/E1.4心房纤颤/给药方式",orderNum ="882")
    private String f4_e4_5;
    @Excel(name = "认知障碍报告表/E既往史/E1.4心房纤颤/给药剂量",orderNum ="883")
    private String f4_e4_6;
    @Excel(name = "认知障碍报告表/E既往史/E1.4心房纤颤/开始用药时间",orderNum ="884")
    private String f4_e4_7;
    @Excel(name = "认知障碍报告表/E既往史/E1.4心房纤颤/是否规律用药",orderNum ="885")
    private String f4_e4_8;
    @Excel(name = "认知障碍报告表/E既往史/E1.4心房纤颤/是否停药",orderNum ="886")
    private String f4_e4_9;
    @Excel(name = "认知障碍报告表/E既往史/E1.4心房纤颤/停药时间",orderNum ="887")
    private String f4_e4_10;
    @Excel(name = "认知障碍报告表/E既往史/E1.4心房纤颤/疾病控制情况",orderNum ="888")
    private String f4_e4_11;
    @Excel(name = "认知障碍报告表/E既往史/E1.5充血性心衰/",orderNum ="889")
    private String f4_e5_1;
    @Excel(name = "认知障碍报告表/E既往史/E1.5充血性心衰/病程",orderNum ="890")
    private String f4_e5_2;
    @Excel(name = "认知障碍报告表/E既往史/E1.5充血性心衰/药品名称",orderNum ="891")
    private String f4_e5_3;
    @Excel(name = "认知障碍报告表/E既往史/E1.5充血性心衰/药物规格",orderNum ="892")
    private String f4_e5_4;
    @Excel(name = "认知障碍报告表/E既往史/E1.5充血性心衰/给药方式",orderNum ="893")
    private String f4_e5_5;
    @Excel(name = "认知障碍报告表/E既往史/E1.5充血性心衰/给药剂量",orderNum ="894")
    private String f4_e5_6;
    @Excel(name = "认知障碍报告表/E既往史/E1.5充血性心衰/开始用药时间",orderNum ="895")
    private String f4_e5_7;
    @Excel(name = "认知障碍报告表/E既往史/E1.5充血性心衰/是否规律用药",orderNum ="896")
    private String f4_e5_8;
    @Excel(name = "认知障碍报告表/E既往史/E1.5充血性心衰/是否停药",orderNum ="897")
    private String f4_e5_9;
    @Excel(name = "认知障碍报告表/E既往史/E1.5充血性心衰/停药时间",orderNum ="898")
    private String f4_e5_10;
    @Excel(name = "认知障碍报告表/E既往史/E1.5充血性心衰/疾病控制情况",orderNum ="899")
    private String f4_e5_11;
    @Excel(name = "认知障碍报告表/E既往史/E1.6其他/",orderNum ="900")
    private String f4_e6_1;
    @Excel(name = "认知障碍报告表/E既往史/E1.6其他/病程",orderNum ="901")
    private String f4_e6_2;
    @Excel(name = "认知障碍报告表/E既往史/E1.6其他/药品名称",orderNum ="902")
    private String f4_e6_3;
    @Excel(name = "认知障碍报告表/E既往史/E1.6其他/药物规格",orderNum ="903")
    private String f4_e6_4;
    @Excel(name = "认知障碍报告表/E既往史/E1.6其他/给药方式",orderNum ="904")
    private String f4_e6_5;
    @Excel(name = "认知障碍报告表/E既往史/E1.6其他/给药剂量",orderNum ="905")
    private String f4_e6_6;
    @Excel(name = "认知障碍报告表/E既往史/E1.6其他/开始用药时间",orderNum ="906")
    private String f4_e6_7;
    @Excel(name = "认知障碍报告表/E既往史/E1.6其他/是否规律用药",orderNum ="907")
    private String f4_e6_8;
    @Excel(name = "认知障碍报告表/E既往史/E1.6其他/是否停药",orderNum ="908")
    private String f4_e6_9;
    @Excel(name = "认知障碍报告表/E既往史/E1.6其他/停药时间",orderNum ="909")
    private String f4_e6_10;
    @Excel(name = "认知障碍报告表/E既往史/E1.6其他/疾病控制情况",orderNum ="910")
    private String f4_e6_11;
    @Excel(name = "认知障碍报告表/E既往史/E2脑血管疾病/E2.1缺血性卒中",orderNum ="911")
    private String f4_2e_1_1;
    @Excel(name = "认知障碍报告表/E既往史/E2脑血管疾病/E2.1缺血性卒中/药品名称",orderNum ="912")
    private String f4_2e_1_2;
    @Excel(name = "认知障碍报告表/E既往史/E2脑血管疾病/E2.1缺血性卒中/药物规格",orderNum ="913")
    private String f4_2e_1_3;
    @Excel(name = "认知障碍报告表/E既往史/E2脑血管疾病/E2.1缺血性卒中/给药方式",orderNum ="914")
    private String f4_2e_1_4;
    @Excel(name = "认知障碍报告表/E既往史/E2脑血管疾病/E2.1缺血性卒中/给药剂量",orderNum ="915")
    private String f4_2e_1_5;
    @Excel(name = "认知障碍报告表/E既往史/E2脑血管疾病/E2.1缺血性卒中/开始用药时间",orderNum ="916")
    private String f4_2e_1_6;
    @Excel(name = "认知障碍报告表/E既往史/E2脑血管疾病/E2.1缺血性卒中/是否规律用药",orderNum ="917")
    private String f4_2e_1_7;
    @Excel(name = "认知障碍报告表/E既往史/E2脑血管疾病/E2.1缺血性卒中/是否停药",orderNum ="918")
    private String f4_2e_1_8;
    @Excel(name = "认知障碍报告表/E既往史/E2脑血管疾病/E2.1缺血性卒中/停药时间",orderNum ="919")
    private String f4_2e_1_9;
    @Excel(name = "认知障碍报告表/E既往史/E2脑血管疾病/E2.1缺血性卒中/疾病控制情况",orderNum ="920")
    private String f4_2e_1_10;
    @Excel(name = "认知障碍报告表/E既往史/E2脑血管疾病/E2.1.1请指出发作次数/第一次哪年",orderNum ="921")
    private String f4_2e_1_12;
    @Excel(name = "认知障碍报告表/E既往史/E2脑血管疾病/E2.1.1请指出发作次数/第一次梗死部位",orderNum ="922")
    private String f4_2e_1_13;
    @Excel(name = "认知障碍报告表/E既往史/E2脑血管疾病/E2.1.1请指出发作次数/第一次遗留后遗症",orderNum ="923")
    private String f4_2e_1_14;
    @Excel(name = "认知障碍报告表/E既往史/E2脑血管疾病/E2.1.1请指出发作次数/第一次遗留后遗症请描述",orderNum ="924")
    private String f4_2e_1_14_1;
    @Excel(name = "认知障碍报告表/E既往史/E2脑血管疾病/E2.1.1请指出发作次数/第二次/哪年",orderNum ="925")
    private String f4_2e_1_15;
    @Excel(name = "认知障碍报告表/E既往史/E2脑血管疾病/E2.1.1请指出发作次数/第二次/梗死部位",orderNum ="926")
    private String f4_2e_1_16;
    @Excel(name = "认知障碍报告表/E既往史/E2脑血管疾病/E2.1.1请指出发作次数/第二次/遗留后遗症",orderNum ="927")
    private String f4_2e_1_17;
    @Excel(name = "认知障碍报告表/E既往史/E2脑血管疾病/E2.1.1请指出发作次数/第二次/请描述",orderNum ="928")
    private String f4_2e_1_18;
    @Excel(name = "认知障碍报告表/E既往史/E2脑血管疾病/E2.1.1请指出发作次数/第三次/哪年",orderNum ="929")
    private String f4_2e_1_19;
    @Excel(name = "认知障碍报告表/E既往史/E2脑血管疾病/E2.1.1请指出发作次数/第三次/梗死部位",orderNum ="930")
    private String f4_2e_1_20;
    @Excel(name = "认知障碍报告表/E既往史/E2脑血管疾病/E2.1.1请指出发作次数/第三次/遗留后遗症",orderNum ="931")
    private String f4_2e_1_21;
    @Excel(name = "认知障碍报告表/E既往史/E2脑血管疾病/E2.1.1请指出发作次数/第三次/请描述",orderNum ="932")
    private String f4_2e_1_21_1;
    @Excel(name = "认知障碍报告表/E既往史/E2脑血管疾病/E2.1.1请指出发作次数/第四次/哪年",orderNum ="933")
    private String f4_2e_1_22;
    @Excel(name = "认知障碍报告表/E既往史/E2脑血管疾病/E2.1.1请指出发作次数/第四次/梗死部位",orderNum ="934")
    private String f4_2e_1_23;
    @Excel(name = "认知障碍报告表/E既往史/E2脑血管疾病/E2.1.1请指出发作次数/第四次/遗留后遗症",orderNum ="935")
    private String f4_2e_1_24;
    @Excel(name = "认知障碍报告表/E既往史/E2脑血管疾病/E2.1.1请指出发作次数/第四次/请描述",orderNum ="936")
    private String f4_2e_1_25;
    @Excel(name = "认知障碍报告表/E既往史/E2脑血管疾病/E2.1.3 病史几个月",orderNum ="937")
    private String f4_2e_1_26;
    @Excel(name = "认知障碍报告表/E既往史/E2.2出血性卒中/",orderNum ="938")
    private String f4_2e_2_1;
    @Excel(name = "认知障碍报告表/E既往史/E2.2出血性卒中/药品名称",orderNum ="939")
    private String f4_2e_2_2;
    @Excel(name = "认知障碍报告表/E既往史/E2.2出血性卒中/药物规格",orderNum ="940")
    private String f4_2e_2_3;
    @Excel(name = "认知障碍报告表/E既往史/E2.2出血性卒中/给药方式",orderNum ="941")
    private String f4_2e_2_4;
    @Excel(name = "认知障碍报告表/E既往史/E2.2出血性卒中/给药剂量",orderNum ="942")
    private String f4_2e_2_5;
    @Excel(name = "认知障碍报告表/E既往史/E2.2出血性卒中/开始用药时间",orderNum ="943")
    private String f4_2e_2_6;
    @Excel(name = "认知障碍报告表/E既往史/E2.2出血性卒中/是否规律用药",orderNum ="944")
    private String f4_2e_2_7;
    @Excel(name = "认知障碍报告表/E既往史/E2.2出血性卒中/是否停药",orderNum ="945")
    private String f4_2e_2_8;
    @Excel(name = "认知障碍报告表/E既往史/E2.2出血性卒中/停药时间",orderNum ="946")
    private String f4_2e_2_9;
    @Excel(name = "认知障碍报告表/E既往史/E2.2出血性卒中/疾病控制情况",orderNum ="947")
    private String f4_2e_2_10;
    @Excel(name = "认知障碍报告表/E既往史/E2.2出血性卒中/E2.1.1请指出发作次数/",orderNum ="948")
    private String f4_2e_2_11;
    @Excel(name = "认知障碍报告表/E既往史/E2.2出血性卒中/E2.1.1请指出发作次数/第一次/哪年",orderNum ="949")
    private String f4_2e_2_12;
    @Excel(name = "认知障碍报告表/E既往史/E2.2出血性卒中/E2.1.1请指出发作次数/第一次/梗死部位",orderNum ="950")
    private String f4_2e_2_13;
    @Excel(name = "认知障碍报告表/E既往史/E2.2出血性卒中/E2.1.1请指出发作次数/第一次/遗留后遗症",orderNum ="951")
    private String f4_2e_2_14;
    @Excel(name = "认知障碍报告表/E既往史/E2.2出血性卒中/E2.1.1请指出发作次数/第一次/请描述",orderNum ="952")
    private String f4_2e_2_14_1;
    @Excel(name = "认知障碍报告表/E既往史/E2.2出血性卒中/E2.1.1请指出发作次数/第二次/哪年",orderNum ="953")
    private String f4_2e_2_15;
    @Excel(name = "认知障碍报告表/E既往史/E2.2出血性卒中/E2.1.1请指出发作次数/第二次/梗死部位",orderNum ="954")
    private String f4_2e_2_16;
    @Excel(name = "认知障碍报告表/E既往史/E2.2出血性卒中/E2.1.1请指出发作次数/第二次/遗留后遗症",orderNum ="955")
    private String f4_2e_2_17;
    @Excel(name = "认知障碍报告表/E既往史/E2.2出血性卒中/E2.1.1请指出发作次数/第二次/请描述",orderNum ="956")
    private String f4_2e_2_17_1;
    @Excel(name = "认知障碍报告表/E既往史/E2.2出血性卒中/E2.1.1请指出发作次数/第三次/哪年",orderNum ="957")
    private String f4_2e_2_18;
    @Excel(name = "认知障碍报告表/E既往史/E2.2出血性卒中/E2.1.1请指出发作次数/第三次/梗死部位",orderNum ="958")
    private String f4_2e_2_19;
    @Excel(name = "认知障碍报告表/E既往史/E2.2出血性卒中/E2.1.1请指出发作次数/第三次/遗留后遗症",orderNum ="959")
    private String f4_2e_2_20;
    @Excel(name = "认知障碍报告表/E既往史/E2.2出血性卒中/E2.1.1请指出发作次数/第三次/请描述",orderNum ="960")
    private String f4_2e_2_21;
    @Excel(name = "认知障碍报告表/E既往史/E2.2出血性卒中/E2.1.1请指出发作次数/第四次/哪年",orderNum ="961")
    private String f4_2e_2_22;
    @Excel(name = "认知障碍报告表/E既往史/E2.2出血性卒中/E2.1.1请指出发作次数/第四次/梗死部位",orderNum ="962")
    private String f4_2e_2_23;
    @Excel(name = "认知障碍报告表/E既往史/E2.2出血性卒中/E2.1.1请指出发作次数/第四次/遗留后遗症",orderNum ="963")
    private String f4_2e_2_24;
    @Excel(name = "认知障碍报告表/E既往史/E2.2出血性卒中/E2.1.1请指出发作次数/第四次/请描述",orderNum ="964")
    private String f4_2e_2_25;
    @Excel(name = "认知障碍报告表/E既往史/E2.2出血性卒中/E2.2.3 病史几个月",orderNum ="965")
    private String f4_2e_2_26;
    @Excel(name = "认知障碍报告表/E既往史/E3.1 帕金森病/",orderNum ="966")
    private String f4_3e_1_1;
    @Excel(name = "认知障碍报告表/E既往史/E3.1 帕金森病/药品名称",orderNum ="967")
    private String f4_3e_1_2;
    @Excel(name = "认知障碍报告表/E既往史/E3.1 帕金森病/药物规格",orderNum ="968")
    private String f4_3e_1_3;
    @Excel(name = "认知障碍报告表/E既往史/E3.1 帕金森病/给药方式",orderNum ="969")
    private String f4_3e_1_4;
    @Excel(name = "认知障碍报告表/E既往史/E3.1 帕金森病/给药剂量",orderNum ="970")
    private String f4_3e_1_5;
    @Excel(name = "认知障碍报告表/E既往史/E3.1 帕金森病/开始用药时间",orderNum ="971")
    private String f4_3e_1_6;
    @Excel(name = "认知障碍报告表/E既往史/E3.1 帕金森病/是否规律用药",orderNum ="972")
    private String f4_3e_1_7;
    @Excel(name = "认知障碍报告表/E既往史/E3.1 帕金森病/是否停药",orderNum ="973")
    private String f4_3e_1_8;
    @Excel(name = "认知障碍报告表/E既往史/E3.1 帕金森病/停药时间",orderNum ="974")
    private String f4_3e_1_9;
    @Excel(name = "认知障碍报告表/E既往史/E3.1 帕金森病/疾病控制情况",orderNum ="975")
    private String f4_3e_1_10;
    @Excel(name = "认知障碍报告表/E既往史/E3.1 帕金森病/E3.1.1请指出诊断的时间（年）",orderNum ="976")
    private String f4_3e_1_11;
    @Excel(name = "认知障碍报告表/E既往史/E3.1 帕金森病/E3.1.2 病史几个月",orderNum ="977")
    private String f4_3e_1_12;
    @Excel(name = "认知障碍报告表/E既往史/E3.2 其他，如帕金森综合征/",orderNum ="978")
    private String f4_3e_2_1;
    @Excel(name = "认知障碍报告表/E既往史/E3.2 其他，如帕金森综合征/药品名称",orderNum ="979")
    private String f4_3e_2_2;
    @Excel(name = "认知障碍报告表/E既往史/E3.2 其他，如帕金森综合征/药物规格",orderNum ="980")
    private String f4_3e_2_3;
    @Excel(name = "认知障碍报告表/E既往史/E3.2 其他，如帕金森综合征/给药方式",orderNum ="981")
    private String f4_3e_2_4;
    @Excel(name = "认知障碍报告表/E既往史/E3.2 其他，如帕金森综合征/给药剂量",orderNum ="982")
    private String f4_3e_2_5;
    @Excel(name = "认知障碍报告表/E既往史/E3.2 其他，如帕金森综合征/开始用药时间",orderNum ="983")
    private String f4_3e_2_6;
    @Excel(name = "认知障碍报告表/E既往史/E3.2 其他，如帕金森综合征/是否规律用药",orderNum ="984")
    private String f4_3e_2_7;
    @Excel(name = "认知障碍报告表/E既往史/E3.2 其他，如帕金森综合征/是否停药",orderNum ="985")
    private String f4_3e_2_8;
    @Excel(name = "认知障碍报告表/E既往史/E3.2 其他，如帕金森综合征/停药时间",orderNum ="986")
    private String f4_3e_2_9;
    @Excel(name = "认知障碍报告表/E既往史/E3.2 其他，如帕金森综合征/疾病控制情况",orderNum ="987")
    private String f4_3e_2_10;
    @Excel(name = "认知障碍报告表/E既往史/E3.2 其他，如帕金森综合征/E3.2.1请指出诊断的时间",orderNum ="988")
    private String f4_3e_2_11;
    @Excel(name = "认知障碍报告表/E既往史/E3.2 其他，如帕金森综合征/E3.2.2 病史几个月",orderNum ="989")
    private String f4_3e_2_12;
    @Excel(name = "认知障碍报告表/E既往史/E4.1癫痫/",orderNum ="990")
    private String f4_4e_1_1;
    @Excel(name = "认知障碍报告表/E既往史/E4.1癫痫/药品名称",orderNum ="991")
    private String f4_4e_1_2;
    @Excel(name = "认知障碍报告表/E既往史/E4.1癫痫/药物规格",orderNum ="992")
    private String f4_4e_1_3;
    @Excel(name = "认知障碍报告表/E既往史/E4.1癫痫/给药方式",orderNum ="993")
    private String f4_4e_1_4;
    @Excel(name = "认知障碍报告表/E既往史/E4.1癫痫/给药剂量",orderNum ="994")
    private String f4_4e_1_5;
    @Excel(name = "认知障碍报告表/E既往史/E4.1癫痫/开始用药时间",orderNum ="995")
    private String f4_4e_1_6;
    @Excel(name = "认知障碍报告表/E既往史/E4.1癫痫/是否规律用药",orderNum ="996")
    private String f4_4e_1_7;
    @Excel(name = "认知障碍报告表/E既往史/E4.1癫痫/是否停药",orderNum ="997")
    private String f4_4e_1_8;
    @Excel(name = "认知障碍报告表/E既往史/E4.1癫痫/停药时间",orderNum ="998")
    private String f4_4e_1_9;
    @Excel(name = "认知障碍报告表/E既往史/E4.1癫痫/疾病控制情况",orderNum ="999")
    private String f4_4e_1_10;
    @Excel(name = "认知障碍报告表/E既往史/E4.1癫痫/E4.1.1请指出诊断的时间",orderNum ="1000")
    private String f4_4e_1_11;
    @Excel(name = "认知障碍报告表/E既往史/E4.1癫痫/E4.1.2 病史几个月",orderNum ="1001")
    private String f4_4e_1_12;
    @Excel(name = "认知障碍报告表/E既往史/E4.2 脑外伤/",orderNum ="1002")
    private String f4_4e_2_1;
    @Excel(name = "认知障碍报告表/E既往史/E4.2 脑外伤/后遗症遗留",orderNum ="1003")
    private String f4_4e_2_2;
    @Excel(name = "认知障碍报告表/E既往史/E4.2 脑外伤/请描述",orderNum ="1004")
    private String f4_4e_2_3;
    @Excel(name = "认知障碍报告表/E既往史/E4.2 脑外伤/药品名称",orderNum ="1005")
    private String f4_4e_2_4;
    @Excel(name = "认知障碍报告表/E既往史/E4.2 脑外伤/药物规格",orderNum ="1006")
    private String f4_4e_2_5;
    @Excel(name = "认知障碍报告表/E既往史/E4.2 脑外伤/给药方式",orderNum ="1007")
    private String f4_4e_2_6;
    @Excel(name = "认知障碍报告表/E既往史/E4.2 脑外伤/给药剂量",orderNum ="1008")
    private String f4_4e_2_7;
    @Excel(name = "认知障碍报告表/E既往史/E4.2 脑外伤/开始用药时间",orderNum ="1009")
    private String f4_4e_2_8;
    @Excel(name = "认知障碍报告表/E既往史/E4.2 脑外伤/是否规律用药",orderNum ="1010")
    private String f4_4e_2_9;
    @Excel(name = "认知障碍报告表/E既往史/E4.2 脑外伤/是否停药",orderNum ="1011")
    private String f4_4e_2_10;
    @Excel(name = "认知障碍报告表/E既往史/E4.2 脑外伤/停药时间",orderNum ="1012")
    private String f4_4e_2_11;
    @Excel(name = "认知障碍报告表/E既往史/E4.2 脑外伤/疾病控制情况",orderNum ="1013")
    private String f4_4e_2_12;
    @Excel(name = "认知障碍报告表/E既往史/E4.2 脑外伤/E4.2.1请指出诊断的时间",orderNum ="1014")
    private String f4_4e_2_13;
    @Excel(name = "认知障碍报告表/E既往史/E4.2 脑外伤/E4.2.2 病史几个月",orderNum ="1015")
    private String f4_4e_2_14;
    @Excel(name = "认知障碍报告表/E既往史/E5.1高血压/",orderNum ="1016")
    private String f4_5e_1_1;
    @Excel(name = "认知障碍报告表/E既往史/E5.1高血压/病程几年",orderNum ="1017")
    private String f4_5e_1_2;
    @Excel(name = "认知障碍报告表/E既往史/E5.1高血压/药品名称",orderNum ="1018")
    private String f4_5e_1_3;
    @Excel(name = "认知障碍报告表/E既往史/E5.1高血压/药物规格",orderNum ="1019")
    private String f4_5e_1_4;
    @Excel(name = "认知障碍报告表/E既往史/E5.1高血压/给药方式",orderNum ="1020")
    private String f4_5e_1_5;
    @Excel(name = "认知障碍报告表/E既往史/E5.1高血压/给药剂量",orderNum ="1021")
    private String f4_5e_1_6;
    @Excel(name = "认知障碍报告表/E既往史/E5.1高血压/开始用药时间",orderNum ="1022")
    private String f4_5e_1_7;
    @Excel(name = "认知障碍报告表/E既往史/E5.1高血压/是否规律用药",orderNum ="1023")
    private String f4_5e_1_8;
    @Excel(name = "认知障碍报告表/E既往史/E5.1高血压/是否停药",orderNum ="1024")
    private String f4_5e_1_9;
    @Excel(name = "认知障碍报告表/E既往史/E5.1高血压/停药时间",orderNum ="1025")
    private String f4_5e_1_10;
    @Excel(name = "认知障碍报告表/E既往史/E5.1高血压/疾病控制情况",orderNum ="1026")
    private String f4_5e_1_11;
    @Excel(name = "认知障碍报告表/E既往史/E5.2 高脂血症/",orderNum ="1027")
    private String f4_5e_2_1;
    @Excel(name = "认知障碍报告表/E既往史/E5.2 高脂血症/病程几年",orderNum ="1028")
    private String f4_5e_2_2;
    @Excel(name = "认知障碍报告表/E既往史/E5.2 高脂血症/药品名称",orderNum ="1029")
    private String f4_5e_2_3;
    @Excel(name = "认知障碍报告表/E既往史/E5.2 高脂血症/药物规格",orderNum ="1030")
    private String f4_5e_2_4;
    @Excel(name = "认知障碍报告表/E既往史/E5.2 高脂血症/给药方式",orderNum ="1031")
    private String f4_5e_2_5;
    @Excel(name = "认知障碍报告表/E既往史/E5.2 高脂血症/给药剂量",orderNum ="1032")
    private String f4_5e_2_6;
    @Excel(name = "认知障碍报告表/E既往史/E5.2 高脂血症/开始用药时间",orderNum ="1033")
    private String f4_5e_2_7;
    @Excel(name = "认知障碍报告表/E既往史/E5.2 高脂血症/是否规律用药",orderNum ="1034")
    private String f4_5e_2_8;
    @Excel(name = "认知障碍报告表/E既往史/E5.2 高脂血症/是否停药",orderNum ="1035")
    private String f4_5e_2_9;
    @Excel(name = "认知障碍报告表/E既往史/E5.2 高脂血症/停药时间",orderNum ="1036")
    private String f4_5e_2_10;
    @Excel(name = "认知障碍报告表/E既往史/E5.2 高脂血症/疾病控制情况",orderNum ="1037")
    private String f4_5e_2_11;
    @Excel(name = "认知障碍报告表/E既往史/E5.3 糖尿病/",orderNum ="1038")
    private String f4_5e_3_1;
    @Excel(name = "认知障碍报告表/E既往史/E5.3 糖尿病/病程几年",orderNum ="1039")
    private String f4_5e_3_2;
    @Excel(name = "认知障碍报告表/E既往史/E5.3 糖尿病/药品名称",orderNum ="1040")
    private String f4_5e_3_3;
    @Excel(name = "认知障碍报告表/E既往史/E5.3 糖尿病/药物规格",orderNum ="1041")
    private String f4_5e_3_4;
    @Excel(name = "认知障碍报告表/E既往史/E5.3 糖尿病/给药方式",orderNum ="1042")
    private String f4_5e_3_5;
    @Excel(name = "认知障碍报告表/E既往史/E5.3 糖尿病/给药剂量",orderNum ="1043")
    private String f4_5e_3_6;
    @Excel(name = "认知障碍报告表/E既往史/E5.3 糖尿病/开始用药时间",orderNum ="1044")
    private String f4_5e_3_7;
    @Excel(name = "认知障碍报告表/E既往史/E5.3 糖尿病/是否规律用药",orderNum ="1045")
    private String f4_5e_3_8;
    @Excel(name = "认知障碍报告表/E既往史/E5.3 糖尿病/是否停药",orderNum ="1046")
    private String f4_5e_3_9;
    @Excel(name = "认知障碍报告表/E既往史/E5.3 糖尿病/停药时间",orderNum ="1047")
    private String f4_5e_3_10;
    @Excel(name = "认知障碍报告表/E既往史/E5.3 糖尿病/疾病控制情况",orderNum ="1048")
    private String f4_5e_3_11;
    @Excel(name = "认知障碍报告表/E既往史/E5.4 高同型半胱氨酸血症/",orderNum ="1049")
    private String f4_5e_4_1;
    @Excel(name = "认知障碍报告表/E既往史/E5.4 高同型半胱氨酸血症/病程几年",orderNum ="1050")
    private String f4_5e_4_2;
    @Excel(name = "认知障碍报告表/E既往史/E5.4 高同型半胱氨酸血症/药品名称",orderNum ="1051")
    private String f4_5e_4_3;
    @Excel(name = "认知障碍报告表/E既往史/E5.4 高同型半胱氨酸血症/药物规格",orderNum ="1052")
    private String f4_5e_4_4;
    @Excel(name = "认知障碍报告表/E既往史/E5.4 高同型半胱氨酸血症/给药方式",orderNum ="1053")
    private String f4_5e_4_5;
    @Excel(name = "认知障碍报告表/E既往史/E5.4 高同型半胱氨酸血症/给药剂量",orderNum ="1054")
    private String f4_5e_4_6;
    @Excel(name = "认知障碍报告表/E既往史/E5.4 高同型半胱氨酸血症/开始用药时间",orderNum ="1055")
    private String f4_5e_4_7;
    @Excel(name = "认知障碍报告表/E既往史/E5.4 高同型半胱氨酸血症/是否规律用药",orderNum ="1056")
    private String f4_5e_4_8;
    @Excel(name = "认知障碍报告表/E既往史/E5.4 高同型半胱氨酸血症/是否停药",orderNum ="1057")
    private String f4_5e_4_9;
    @Excel(name = "认知障碍报告表/E既往史/E5.4 高同型半胱氨酸血症/停药时间",orderNum ="1058")
    private String f4_5e_4_10;
    @Excel(name = "认知障碍报告表/E既往史/E5.4 高同型半胱氨酸血症/疾病控制情况",orderNum ="1059")
    private String f4_5e_4_11;
    @Excel(name = "认知障碍报告表/E既往史/E5.5 维生素B12缺乏/",orderNum ="1060")
    private String f4_5e_5_1;
    @Excel(name = "认知障碍报告表/E既往史/E5.5 维生素B12缺乏/病程几年",orderNum ="1061")
    private String f4_5e_5_2;
    @Excel(name = "认知障碍报告表/E既往史/E5.5 维生素B12缺乏/药品名称",orderNum ="1062")
    private String f4_5e_5_3;
    @Excel(name = "认知障碍报告表/E既往史/E5.5 维生素B12缺乏/药物规格",orderNum ="1063")
    private String f4_5e_5_4;
    @Excel(name = "认知障碍报告表/E既往史/E5.5 维生素B12缺乏/给药方式",orderNum ="1064")
    private String f4_5e_5_5;
    @Excel(name = "认知障碍报告表/E既往史/E5.5 维生素B12缺乏/给药剂量",orderNum ="1065")
    private String f4_5e_5_6;
    @Excel(name = "认知障碍报告表/E既往史/E5.5 维生素B12缺乏/开始用药时间",orderNum ="1066")
    private String f4_5e_5_7;
    @Excel(name = "认知障碍报告表/E既往史/E5.5 维生素B12缺乏/是否规律用药",orderNum ="1067")
    private String f4_5e_5_8;
    @Excel(name = "认知障碍报告表/E既往史/E5.5 维生素B12缺乏/是否停药",orderNum ="1068")
    private String f4_5e_5_9;
    @Excel(name = "认知障碍报告表/E既往史/E5.5 维生素B12缺乏/停药时间",orderNum ="1069")
    private String f4_5e_5_10;
    @Excel(name = "认知障碍报告表/E既往史/E5.5 维生素B12缺乏/疾病控制情况",orderNum ="1070")
    private String f4_5e_5_11;
    @Excel(name = "认知障碍报告表/E既往史/E5.6 甲状腺疾病/",orderNum ="1071")
    private String f4_5e_6_1;
    @Excel(name = "认知障碍报告表/E既往史/E5.6 甲状腺疾病/病程几年",orderNum ="1072")
    private String f4_5e_6_2;
    @Excel(name = "认知障碍报告表/E既往史/E5.6 甲状腺疾病/药品名称",orderNum ="1073")
    private String f4_5e_6_3;
    @Excel(name = "认知障碍报告表/E既往史/E5.6 甲状腺疾病/药物规格",orderNum ="1074")
    private String f4_5e_6_4;
    @Excel(name = "认知障碍报告表/E既往史/E5.6 甲状腺疾病/给药方式",orderNum ="1075")
    private String f4_5e_6_5;
    @Excel(name = "认知障碍报告表/E既往史/E5.6 甲状腺疾病/给药剂量",orderNum ="1076")
    private String f4_5e_6_6;
    @Excel(name = "认知障碍报告表/E既往史/E5.6 甲状腺疾病/开始用药时间",orderNum ="1077")
    private String f4_5e_6_7;
    @Excel(name = "认知障碍报告表/E既往史/E5.6 甲状腺疾病/是否规律用药",orderNum ="1078")
    private String f4_5e_6_8;
    @Excel(name = "认知障碍报告表/E既往史/E5.6 甲状腺疾病/是否停药",orderNum ="1079")
    private String f4_5e_6_9;
    @Excel(name = "认知障碍报告表/E既往史/E5.6 甲状腺疾病/停药时间",orderNum ="1080")
    private String f4_5e_6_10;
    @Excel(name = "认知障碍报告表/E既往史/E5.6 甲状腺疾病/疾病控制情况",orderNum ="1081")
    private String f4_5e_6_11;
    @Excel(name = "认知障碍报告表/E既往史/E5.6 甲状腺疾病/甲状腺疾病类型",orderNum ="1082")
    private String f4_5e_6_12;
    @Excel(name = "认知障碍报告表/E既往史/E5.6 甲状腺疾病/甲状腺疾病类型3其他",orderNum ="1083")
    private String f4_5e_6_13;
    @Excel(name = "认知障碍报告表/E既往史/E5.7 慢性阻塞性肺病/",orderNum ="1084")
    private String f4_5e_7_1;
    @Excel(name = "认知障碍报告表/E既往史/E5.7 慢性阻塞性肺病/病程几年",orderNum ="1085")
    private String f4_5e_7_2;
    @Excel(name = "认知障碍报告表/E既往史/E5.7 慢性阻塞性肺病/药品名称",orderNum ="1086")
    private String f4_5e_7_3;
    @Excel(name = "认知障碍报告表/E既往史/E5.7 慢性阻塞性肺病/药物规格",orderNum ="1087")
    private String f4_5e_7_4;
    @Excel(name = "认知障碍报告表/E既往史/E5.7 慢性阻塞性肺病/给药方式",orderNum ="1088")
    private String f4_5e_7_5;
    @Excel(name = "认知障碍报告表/E既往史/E5.7 慢性阻塞性肺病/给药剂量",orderNum ="1089")
    private String f4_5e_7_6;
    @Excel(name = "认知障碍报告表/E既往史/E5.7 慢性阻塞性肺病/开始用药时间",orderNum ="1090")
    private String f4_5e_7_7;
    @Excel(name = "认知障碍报告表/E既往史/E5.7 慢性阻塞性肺病/是否规律用药",orderNum ="1091")
    private String f4_5e_7_8;
    @Excel(name = "认知障碍报告表/E既往史/E5.7 慢性阻塞性肺病/是否停药",orderNum ="1092")
    private String f4_5e_7_9;
    @Excel(name = "认知障碍报告表/E既往史/E5.7 慢性阻塞性肺病/停药时间",orderNum ="1093")
    private String f4_5e_7_10;
    @Excel(name = "认知障碍报告表/E既往史/E5.7 慢性阻塞性肺病/疾病控制情况",orderNum ="1094")
    private String f4_5e_7_11;
    @Excel(name = "认知障碍报告表/E既往史/E5.8 哮喘/",orderNum ="1095")
    private String f4_5e_8_1;
    @Excel(name = "认知障碍报告表/E既往史/E5.8 哮喘/病程几年",orderNum ="1096")
    private String f4_5e_8_2;
    @Excel(name = "认知障碍报告表/E既往史/E5.8 哮喘/药品名称",orderNum ="1097")
    private String f4_5e_8_3;
    @Excel(name = "认知障碍报告表/E既往史/E5.8 哮喘/药物规格",orderNum ="1098")
    private String f4_5e_8_4;
    @Excel(name = "认知障碍报告表/E既往史/E5.8 哮喘/给药方式",orderNum ="1099")
    private String f4_5e_8_5;
    @Excel(name = "认知障碍报告表/E既往史/E5.8 哮喘/给药剂量",orderNum ="1100")
    private String f4_5e_8_6;
    @Excel(name = "认知障碍报告表/E既往史/E5.8 哮喘/开始用药时间",orderNum ="1101")
    private String f4_5e_8_7;
    @Excel(name = "认知障碍报告表/E既往史/E5.8 哮喘/是否规律用药",orderNum ="1102")
    private String f4_5e_8_8;
    @Excel(name = "认知障碍报告表/E既往史/E5.8 哮喘/是否停药",orderNum ="1103")
    private String f4_5e_8_9;
    @Excel(name = "认知障碍报告表/E既往史/E5.8 哮喘/停药时间",orderNum ="1104")
    private String f4_5e_8_10;
    @Excel(name = "认知障碍报告表/E既往史/E5.8 哮喘/疾病控制情况",orderNum ="1105")
    private String f4_5e_8_11;
    @Excel(name = "认知障碍报告表/E既往史/E5.9 失眠/",orderNum ="1106")
    private String f4_5e_9_1;
    @Excel(name = "认知障碍报告表/E既往史/E5.9 失眠/病程几年",orderNum ="1107")
    private String f4_5e_9_2;
    @Excel(name = "认知障碍报告表/E既往史/E5.9 失眠/药品名称",orderNum ="1108")
    private String f4_5e_9_3;
    @Excel(name = "认知障碍报告表/E既往史/E5.9 失眠/药物规格",orderNum ="1109")
    private String f4_5e_9_4;
    @Excel(name = "认知障碍报告表/E既往史/E5.9 失眠/给药方式",orderNum ="1110")
    private String f4_5e_9_5;
    @Excel(name = "认知障碍报告表/E既往史/E5.9 失眠/给药剂量",orderNum ="1111")
    private String f4_5e_9_6;
    @Excel(name = "认知障碍报告表/E既往史/E5.9 失眠/开始用药时间",orderNum ="1112")
    private String f4_5e_9_7;
    @Excel(name = "认知障碍报告表/E既往史/E5.9 失眠/是否规律用药",orderNum ="1113")
    private String f4_5e_9_8;
    @Excel(name = "认知障碍报告表/E既往史/E5.9 失眠/是否停药",orderNum ="1114")
    private String f4_5e_9_9;
    @Excel(name = "认知障碍报告表/E既往史/E5.9 失眠/停药时间",orderNum ="1115")
    private String f4_5e_9_10;
    @Excel(name = "认知障碍报告表/E既往史/E5.9 失眠/疾病控制情况",orderNum ="1116")
    private String f4_5e_9_11;
    @Excel(name = "认知障碍报告表/E既往史/E5.10 睡眠呼吸暂停综合征/",orderNum ="1117")
    private String f4_5e_10_1;
    @Excel(name = "认知障碍报告表/E既往史/E5.10 睡眠呼吸暂停综合征/病程几年",orderNum ="1118")
    private String f4_5e_10_2;
    @Excel(name = "认知障碍报告表/E既往史/E5.10 睡眠呼吸暂停综合征/药品名称",orderNum ="1119")
    private String f4_5e_10_3;
    @Excel(name = "认知障碍报告表/E既往史/E5.10 睡眠呼吸暂停综合征/药物规格",orderNum ="1120")
    private String f4_5e_10_4;
    @Excel(name = "认知障碍报告表/E既往史/E5.10 睡眠呼吸暂停综合征/给药方式",orderNum ="1121")
    private String f4_5e_10_5;
    @Excel(name = "认知障碍报告表/E既往史/E5.10 睡眠呼吸暂停综合征/给药剂量",orderNum ="1122")
    private String f4_5e_10_6;
    @Excel(name = "认知障碍报告表/E既往史/E5.10 睡眠呼吸暂停综合征/开始用药时间",orderNum ="1123")
    private String f4_5e_10_7;
    @Excel(name = "认知障碍报告表/E既往史/E5.10 睡眠呼吸暂停综合征/是否规律用药",orderNum ="1124")
    private String f4_5e_10_8;
    @Excel(name = "认知障碍报告表/E既往史/E5.10 睡眠呼吸暂停综合征/是否停药",orderNum ="1125")
    private String f4_5e_10_9;
    @Excel(name = "认知障碍报告表/E既往史/E5.10 睡眠呼吸暂停综合征/停药时间",orderNum ="1126")
    private String f4_5e_10_10;
    @Excel(name = "认知障碍报告表/E既往史/E5.10 睡眠呼吸暂停综合征/疾病控制情况",orderNum ="1127")
    private String f4_5e_10_11;
    @Excel(name = "认知障碍报告表/E既往史/E5.11 慢性肾脏病/",orderNum ="1128")
    private String f4_5e_11_1;
    @Excel(name = "认知障碍报告表/E既往史/E5.11 慢性肾脏病/病程几年",orderNum ="1129")
    private String f4_5e_11_2;
    @Excel(name = "认知障碍报告表/E既往史/E5.11 慢性肾脏病/药品名称",orderNum ="1130")
    private String f4_5e_11_3;
    @Excel(name = "认知障碍报告表/E既往史/E5.11 慢性肾脏病/药物规格",orderNum ="1131")
    private String f4_5e_11_4;
    @Excel(name = "认知障碍报告表/E既往史/E5.11 慢性肾脏病/给药方式",orderNum ="1132")
    private String f4_5e_11_5;
    @Excel(name = "认知障碍报告表/E既往史/E5.11 慢性肾脏病/给药剂量",orderNum ="1133")
    private String f4_5e_11_6;
    @Excel(name = "认知障碍报告表/E既往史/E5.11 慢性肾脏病/开始用药时间",orderNum ="1134")
    private String f4_5e_11_7;
    @Excel(name = "认知障碍报告表/E既往史/E5.11 慢性肾脏病/是否规律用药",orderNum ="1135")
    private String f4_5e_11_8;
    @Excel(name = "认知障碍报告表/E既往史/E5.11 慢性肾脏病/是否停药",orderNum ="1136")
    private String f4_5e_11_9;
    @Excel(name = "认知障碍报告表/E既往史/E5.11 慢性肾脏病/停药时间",orderNum ="1137")
    private String f4_5e_11_10;
    @Excel(name = "认知障碍报告表/E既往史/E5.11 慢性肾脏病/疾病控制情况",orderNum ="1138")
    private String f4_5e_11_11;
    @Excel(name = "认知障碍报告表/E既往史/E5.11 慢性肾脏病/E5.11.3慢性肾脏病类型",orderNum ="1139")
    private String f4_5e_11_12;
    @Excel(name = "认知障碍报告表/E既往史/E5.11 慢性肾脏病/E5.11.3慢性肾脏病类型其他",orderNum ="1140")
    private String f4_5e_11_13;
    @Excel(name = "认知障碍报告表/E既往史/E5.12 类风湿性关节炎/",orderNum ="1141")
    private String f4_5e_12_1;
    @Excel(name = "认知障碍报告表/E既往史/E5.12 类风湿性关节炎/病程几年",orderNum ="1142")
    private String f4_5e_12_2;
    @Excel(name = "认知障碍报告表/E既往史/E5.12 类风湿性关节炎/药品名称",orderNum ="1143")
    private String f4_5e_12_3;
    @Excel(name = "认知障碍报告表/E既往史/E5.12 类风湿性关节炎/药物规格",orderNum ="1144")
    private String f4_5e_12_4;
    @Excel(name = "认知障碍报告表/E既往史/E5.12 类风湿性关节炎/给药方式",orderNum ="1145")
    private String f4_5e_12_5;
    @Excel(name = "认知障碍报告表/E既往史/E5.12 类风湿性关节炎/给药剂量",orderNum ="1146")
    private String f4_5e_12_6;
    @Excel(name = "认知障碍报告表/E既往史/E5.12 类风湿性关节炎/开始用药时间",orderNum ="1147")
    private String f4_5e_12_7;
    @Excel(name = "认知障碍报告表/E既往史/E5.12 类风湿性关节炎/是否规律用药",orderNum ="1148")
    private String f4_5e_12_8;
    @Excel(name = "认知障碍报告表/E既往史/E5.12 类风湿性关节炎/是否停药",orderNum ="1149")
    private String f4_5e_12_9;
    @Excel(name = "认知障碍报告表/E既往史/E5.12 类风湿性关节炎/停药时间",orderNum ="1150")
    private String f4_5e_12_10;
    @Excel(name = "认知障碍报告表/E既往史/E5.12 类风湿性关节炎/疾病控制情况",orderNum ="1151")
    private String f4_5e_12_11;
    @Excel(name = "认知障碍报告表/E既往史/E5.13 其他可能影响认知功能的内科疾病/",orderNum ="1152")
    private String f4_5e_13_1;
    @Excel(name = "认知障碍报告表/E既往史/E5.13 其他可能影响认知功能的内科疾病/疾病名称",orderNum ="1153")
    private String f4_5e_13_2;
    @Excel(name = "认知障碍报告表/E既往史/E5.13 其他可能影响认知功能的内科疾病/病程几年",orderNum ="1154")
    private String f4_5e_13_3;
    @Excel(name = "认知障碍报告表/E既往史/E5.13 其他可能影响认知功能的内科疾病/药品名称",orderNum ="1155")
    private String f4_5e_13_4;
    @Excel(name = "认知障碍报告表/E既往史/E5.13 其他可能影响认知功能的内科疾病/药物规格",orderNum ="1156")
    private String f4_5e_13_5;
    @Excel(name = "认知障碍报告表/E既往史/E5.13 其他可能影响认知功能的内科疾病/给药方式",orderNum ="1157")
    private String f4_5e_13_6;
    @Excel(name = "认知障碍报告表/E既往史/E5.13 其他可能影响认知功能的内科疾病/给药剂量",orderNum ="1158")
    private String f4_5e_13_7;
    @Excel(name = "认知障碍报告表/E既往史/E5.13 其他可能影响认知功能的内科疾病/开始用药时间",orderNum ="1159")
    private String f4_5e_13_8;
    @Excel(name = "认知障碍报告表/E既往史/E5.13 其他可能影响认知功能的内科疾病/是否规律用药",orderNum ="1160")
    private String f4_5e_13_9;
    @Excel(name = "认知障碍报告表/E既往史/E5.13 其他可能影响认知功能的内科疾病/是否停药",orderNum ="1161")
    private String f4_5e_13_10;
    @Excel(name = "认知障碍报告表/E既往史/E5.13 其他可能影响认知功能的内科疾病/停药时间",orderNum ="1162")
    private String f4_5e_13_11;
    @Excel(name = "认知障碍报告表/E既往史/E5.13 其他可能影响认知功能的内科疾病/疾病控制情况",orderNum ="1163")
    private String f4_5e_13_12;
    @Excel(name = "认知障碍报告表/E既往史/E6精神疾病/E6.1抑郁/",orderNum ="1164")
    private String f4_6e_1_1;
    @Excel(name = "认知障碍报告表/E既往史/E6精神疾病/E6.1抑郁/诊断时间",orderNum ="1165")
    private String f4_6e_1_2;
    @Excel(name = "认知障碍报告表/E既往史/E6精神疾病/E6.1抑郁/药品名称",orderNum ="1166")
    private String f4_6e_1_3;
    @Excel(name = "认知障碍报告表/E既往史/E6精神疾病/E6.1抑郁/药物规格",orderNum ="1167")
    private String f4_6e_1_4;
    @Excel(name = "认知障碍报告表/E既往史/E6精神疾病/E6.1抑郁/给药方式",orderNum ="1168")
    private String f4_6e_1_5;
    @Excel(name = "认知障碍报告表/E既往史/E6精神疾病/E6.1抑郁/给药剂量",orderNum ="1169")
    private String f4_6e_1_6;
    @Excel(name = "认知障碍报告表/E既往史/E6精神疾病/E6.1抑郁/开始用药时间",orderNum ="1170")
    private String f4_6e_1_7;
    @Excel(name = "认知障碍报告表/E既往史/E6精神疾病/E6.1抑郁/是否规律用药",orderNum ="1171")
    private String f4_6e_1_8;
    @Excel(name = "认知障碍报告表/E既往史/E6精神疾病/E6.1抑郁/是否停药",orderNum ="1172")
    private String f4_6e_1_9;
    @Excel(name = "认知障碍报告表/E既往史/E6精神疾病/E6.1抑郁/停药时间",orderNum ="1173")
    private String f4_6e_1_10;
    @Excel(name = "认知障碍报告表/E既往史/E6精神疾病/E6.1抑郁/疾病控制情况",orderNum ="1174")
    private String f4_6e_1_11;
    @Excel(name = "认知障碍报告表/E既往史/E6精神疾病/E6.1抑郁/E6.1.3 病史几个月",orderNum ="1175")
    private String f4_6e_1_12;
    @Excel(name = "认知障碍报告表/E既往史/E6精神疾病/E6.2 除了抑郁以外的其他精神疾病/",orderNum ="1176")
    private String f4_6e_2_1;
    @Excel(name = "认知障碍报告表/E既往史/E6精神疾病/E6.2 除了抑郁以外的其他精神疾病/诊断时间",orderNum ="1177")
    private String f4_6e_2_2;
    @Excel(name = "认知障碍报告表/E既往史/E6精神疾病/E6.2 除了抑郁以外的其他精神疾病/疾病名称",orderNum ="1178")
    private String f4_6e_2_3;
    @Excel(name = "认知障碍报告表/E既往史/E6精神疾病/E6.2 除了抑郁以外的其他精神疾病/药品名称",orderNum ="1179")
    private String f4_6e_2_4;
    @Excel(name = "认知障碍报告表/E既往史/E6精神疾病/E6.2 除了抑郁以外的其他精神疾病/药物规格",orderNum ="1180")
    private String f4_6e_2_5;
    @Excel(name = "认知障碍报告表/E既往史/E6精神疾病/E6.2 除了抑郁以外的其他精神疾病/给药方式",orderNum ="1181")
    private String f4_6e_2_6;
    @Excel(name = "认知障碍报告表/E既往史/E6精神疾病/E6.2 除了抑郁以外的其他精神疾病/给药剂量",orderNum ="1182")
    private String f4_6e_2_7;
    @Excel(name = "认知障碍报告表/E既往史/E6精神疾病/E6.2 除了抑郁以外的其他精神疾病/开始用药时间",orderNum ="1183")
    private String f4_6e_2_8;
    @Excel(name = "认知障碍报告表/E既往史/E6精神疾病/E6.2 除了抑郁以外的其他精神疾病/是否规律用药",orderNum ="1184")
    private String f4_6e_2_9;
    @Excel(name = "认知障碍报告表/E既往史/E6精神疾病/E6.2 除了抑郁以外的其他精神疾病/是否停药",orderNum ="1185")
    private String f4_6e_2_10;
    @Excel(name = "认知障碍报告表/E既往史/E6精神疾病/E6.2 除了抑郁以外的其他精神疾病/停药时间",orderNum ="1186")
    private String f4_6e_2_11;
    @Excel(name = "认知障碍报告表/E既往史/E6精神疾病/E6.2 除了抑郁以外的其他精神疾病/疾病控制情况",orderNum ="1187")
    private String f4_6e_2_12;
    @Excel(name = "认知障碍报告表/E既往史/E6精神疾病/E6.2 除了抑郁以外的其他精神疾病/E6.2.3 病史几个月",orderNum ="1188")
    private String f4_6e_2_13;
    @Excel(name = "认知障碍报告表/E既往史/E7恶性肿瘤病史/",orderNum ="1189")
    private String f4_7e_1_1;
    @Excel(name = "认知障碍报告表/E既往史/E7恶性肿瘤病史/肿瘤名称",orderNum ="1190")
    private String f4_7e_1_2;
    @Excel(name = "认知障碍报告表/E既往史/E7恶性肿瘤病史/症状出现的时间",orderNum ="1191")
    private String f4_7e_1_3;
    @Excel(name = "认知障碍报告表/E既往史/E7恶性肿瘤病史/病程几个月",orderNum ="1192")
    private String f4_7e_1_4;
    @Excel(name = "认知障碍报告表/E既往史/E7恶性肿瘤病史/是否手术",orderNum ="1193")
    private String f4_7e_1_5;
    @Excel(name = "认知障碍报告表/E既往史/E7恶性肿瘤病史/手术名称",orderNum ="1194")
    private String f4_7e_1_6;
    @Excel(name = "认知障碍报告表/E既往史/E7恶性肿瘤病史/手术时间",orderNum ="1195")
    private String f4_7e_1_7;
    @Excel(name = "认知障碍报告表/E既往史/E7恶性肿瘤病史/术后几年",orderNum ="1196")
    private String f4_7e_1_8;
    @Excel(name = "认知障碍报告表/E既往史/E7恶性肿瘤病史/术后是否放/化疗",orderNum ="1197")
    private String f4_7e_1_9;
    @Excel(name = "认知障碍报告表/E既往史/E7恶性肿瘤病史/术后是否放/化疗",orderNum ="1198")
    private String f4_7e_1_10;
    @Excel(name = "认知障碍报告表/E既往史/E8往手术史/",orderNum ="1199")
    private String f4_8e_1_1;
    @Excel(name = "认知障碍报告表/E既往史/E8往手术史/手术名称",orderNum ="1200")
    private String f4_8e_1_2;
    @Excel(name = "认知障碍报告表/E既往史/E8往手术史/做手术的时间",orderNum ="1201")
    private String f4_8e_1_3;
    @Excel(name = "认知障碍报告表/E既往史/E8往手术史/是否全麻",orderNum ="1202")
    private String f4_8e_1_4;
    @Excel(name = "认知障碍报告表/E既往史/E9 临床终点事件/",orderNum ="1203")
    private String f4_9e_1_1;
    @Excel(name = "认知障碍报告表/E既往史/E9 临床终点事件/发生时间",orderNum ="1204")
    private String f4_9e_1_2;
    @Excel(name = "认知障碍报告表/E既往史/E9 临床终点事件/事件说明",orderNum ="1205")
    private String f4_9e_1_3;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F1多奈哌齐/",orderNum ="1206")
    private String f4_f1_1_1;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F1多奈哌齐/给药方式",orderNum ="1207")
    private String f4_f1_1_2;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F1多奈哌齐/给药剂量",orderNum ="1208")
    private String f4_f1_1_3;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F1多奈哌齐/开始用药时间",orderNum ="1209")
    private String f4_f1_1_4;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F1多奈哌齐/是否规律用药",orderNum ="1210")
    private String f4_f1_1_5;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F1多奈哌齐/是否停药",orderNum ="1211")
    private String f4_f1_1_6;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F1多奈哌齐/停药时间",orderNum ="1212")
    private String f4_f1_1_7;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F1多奈哌齐/疾病控制情况",orderNum ="1213")
    private String f4_f1_1_8;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F2巴拉汀/",orderNum ="1214")
    private String f4_f2_1_1;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F2巴拉汀/给药方式",orderNum ="1215")
    private String f4_f2_1_2;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F2巴拉汀/给药剂量",orderNum ="1216")
    private String f4_f2_1_3;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F2巴拉汀/开始用药时间",orderNum ="1217")
    private String f4_f2_1_4;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F2巴拉汀/是否规律用药",orderNum ="1218")
    private String f4_f2_1_5;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F2巴拉汀/是否停药",orderNum ="1219")
    private String f4_f2_1_6;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F2巴拉汀/停药时间",orderNum ="1220")
    private String f4_f2_1_7;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F2巴拉汀/疾病控制情况",orderNum ="1221")
    private String f4_f2_1_8;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F3美金刚/",orderNum ="1222")
    private String f4_f3_1_1;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F3美金刚/给药方式",orderNum ="1223")
    private String f4_f3_1_2;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F3美金刚/给药剂量",orderNum ="1224")
    private String f4_f3_1_3;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F3美金刚/开始用药时间",orderNum ="1225")
    private String f4_f3_1_4;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F3美金刚/是否规律用药",orderNum ="1226")
    private String f4_f3_1_5;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F3美金刚/是否停药",orderNum ="1227")
    private String f4_f3_1_6;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F3美金刚/停药时间",orderNum ="1228")
    private String f4_f3_1_7;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F3美金刚/疾病控制情况",orderNum ="1229")
    private String f4_f3_1_8;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F4石杉碱甲/",orderNum ="1230")
    private String f4_f4_1_1;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F4石杉碱甲/给药方式",orderNum ="1231")
    private String f4_f4_1_2;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F4石杉碱甲/给药剂量",orderNum ="1232")
    private String f4_f4_1_3;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F4石杉碱甲/开始用药时间",orderNum ="1233")
    private String f4_f4_1_4;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F4石杉碱甲/是否规律用药",orderNum ="1234")
    private String f4_f4_1_5;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F4石杉碱甲/是否停药",orderNum ="1235")
    private String f4_f4_1_6;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F4石杉碱甲/停药时间",orderNum ="1236")
    private String f4_f4_1_7;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F4石杉碱甲/疾病控制情况",orderNum ="1237")
    private String f4_f4_1_8;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F5奥拉西坦/",orderNum ="1238")
    private String f4_f5_1_1;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F5奥拉西坦/给药方式",orderNum ="1239")
    private String f4_f5_1_2;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F5奥拉西坦/给药剂量",orderNum ="1240")
    private String f4_f5_1_3;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F5奥拉西坦/开始用药时间",orderNum ="1241")
    private String f4_f5_1_4;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F5奥拉西坦/是否规律用药",orderNum ="1242")
    private String f4_f5_1_5;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F5奥拉西坦/是否停药",orderNum ="1243")
    private String f4_f5_1_6;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F5奥拉西坦/停药时间",orderNum ="1244")
    private String f4_f5_1_7;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F5奥拉西坦/疾病控制情况",orderNum ="1245")
    private String f4_f5_1_8;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F6茴拉西坦/",orderNum ="1246")
    private String f4_f6_1_1;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F6茴拉西坦/给药方式",orderNum ="1247")
    private String f4_f6_1_2;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F6茴拉西坦/给药剂量",orderNum ="1248")
    private String f4_f6_1_3;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F6茴拉西坦/开始用药时间",orderNum ="1249")
    private String f4_f6_1_4;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F6茴拉西坦/是否规律用药",orderNum ="1250")
    private String f4_f6_1_5;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F6茴拉西坦/是否停药",orderNum ="1251")
    private String f4_f6_1_6;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F6茴拉西坦/停药时间",orderNum ="1252")
    private String f4_f6_1_7;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F6茴拉西坦/疾病控制情况",orderNum ="1253")
    private String f4_f6_1_8;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F7尼麦角林/",orderNum ="1254")
    private String f4_f7_1_1;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F7尼麦角林/给药方式",orderNum ="1255")
    private String f4_f7_1_2;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F7尼麦角林/给药剂量",orderNum ="1256")
    private String f4_f7_1_3;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F7尼麦角林/开始用药时间",orderNum ="1257")
    private String f4_f7_1_4;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F7尼麦角林/是否规律用药",orderNum ="1258")
    private String f4_f7_1_5;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F7尼麦角林/是否停药",orderNum ="1259")
    private String f4_f7_1_6;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F7尼麦角林/停药时间",orderNum ="1260")
    private String f4_f7_1_7;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F7尼麦角林/疾病控制情况",orderNum ="1261")
    private String f4_f7_1_8;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F8银杏叶/",orderNum ="1262")
    private String f4_f8_1_1;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F8银杏叶/给药方式",orderNum ="1263")
    private String f4_f8_1_2;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F8银杏叶/给药剂量",orderNum ="1264")
    private String f4_f8_1_3;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F8银杏叶/开始用药时间",orderNum ="1265")
    private String f4_f8_1_4;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F8银杏叶/是否规律用药",orderNum ="1266")
    private String f4_f8_1_5;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F8银杏叶/是否停药",orderNum ="1267")
    private String f4_f8_1_6;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F8银杏叶/停药时间",orderNum ="1268")
    private String f4_f8_1_7;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F8银杏叶/疾病控制情况",orderNum ="1269")
    private String f4_f8_1_8;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F9奥氮平/",orderNum ="1270")
    private String f4_f9_1_1;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F9奥氮平/给药方式",orderNum ="1271")
    private String f4_f9_1_2;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F9奥氮平/给药剂量",orderNum ="1272")
    private String f4_f9_1_3;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F9奥氮平/开始用药时间",orderNum ="1273")
    private String f4_f9_1_4;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F9奥氮平/是否规律用药",orderNum ="1274")
    private String f4_f9_1_5;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F9奥氮平/是否停药",orderNum ="1275")
    private String f4_f9_1_6;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F9奥氮平/停药时间",orderNum ="1276")
    private String f4_f9_1_7;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F9奥氮平/疾病控制情况",orderNum ="1277")
    private String f4_f9_1_8;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F10喹硫平/",orderNum ="1278")
    private String f4_f10_1_1;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F10喹硫平/给药方式",orderNum ="1279")
    private String f4_f10_1_2;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F10喹硫平/给药剂量",orderNum ="1280")
    private String f4_f10_1_3;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F10喹硫平/开始用药时间",orderNum ="1281")
    private String f4_f10_1_4;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F10喹硫平/是否规律用药",orderNum ="1282")
    private String f4_f10_1_5;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F10喹硫平/是否停药",orderNum ="1283")
    private String f4_f10_1_6;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F10喹硫平/停药时间",orderNum ="1284")
    private String f4_f10_1_7;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F10喹硫平/疾病控制情况",orderNum ="1285")
    private String f4_f10_1_8;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F11利培酮/",orderNum ="1286")
    private String f4_f11_1_1;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F11利培酮/给药方式",orderNum ="1287")
    private String f4_f11_1_2;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F11利培酮/给药剂量",orderNum ="1288")
    private String f4_f11_1_3;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F11利培酮/开始用药时间",orderNum ="1289")
    private String f4_f11_1_4;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F11利培酮/是否规律用药",orderNum ="1290")
    private String f4_f11_1_5;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F11利培酮/是否停药",orderNum ="1291")
    private String f4_f11_1_6;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F11利培酮/停药时间",orderNum ="1292")
    private String f4_f11_1_7;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F11利培酮/疾病控制情况",orderNum ="1293")
    private String f4_f11_1_8;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F12SSRI抗抑郁药物/",orderNum ="1294")
    private String f4_f12_1_1;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F12SSRI抗抑郁药物/药物名称",orderNum ="1295")
    private String f4_f12_1_2;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F12SSRI抗抑郁药物/给药方式",orderNum ="1296")
    private String f4_f12_1_3;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F12SSRI抗抑郁药物/给药剂量",orderNum ="1297")
    private String f4_f12_1_4;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F12SSRI抗抑郁药物/开始用药时间",orderNum ="1298")
    private String f4_f12_1_5;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F12SSRI抗抑郁药物/是否规律用药",orderNum ="1299")
    private String f4_f12_1_6;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F12SSRI抗抑郁药物/是否停药",orderNum ="1300")
    private String f4_f12_1_7;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F12SSRI抗抑郁药物/停药时间",orderNum ="1301")
    private String f4_f12_1_8;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F12SSRI抗抑郁药物/疾病控制情况",orderNum ="1302")
    private String f4_f12_1_9;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F13SSNR抗抑郁药物/",orderNum ="1303")
    private String f4_f13_1_1;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F13SSNR抗抑郁药物/药物名称",orderNum ="1304")
    private String f4_f13_1_2;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F13SSNR抗抑郁药物/给药方式",orderNum ="1305")
    private String f4_f13_1_3;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F13SSNR抗抑郁药物/给药剂量",orderNum ="1306")
    private String f4_f13_1_4;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F13SSNR抗抑郁药物/开始用药时间",orderNum ="1307")
    private String f4_f13_1_5;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F13SSNR抗抑郁药物/是否规律用药",orderNum ="1308")
    private String f4_f13_1_6;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F13SSNR抗抑郁药物/是否停药",orderNum ="1309")
    private String f4_f13_1_7;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F13SSNR抗抑郁药物/停药时间",orderNum ="1310")
    private String f4_f13_1_8;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F13SSNR抗抑郁药物/疾病控制情况",orderNum ="1311")
    private String f4_f13_1_9;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F14苯二氮卓类抗焦虑药物/",orderNum ="1312")
    private String f4_f14_1_1;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F14苯二氮卓类抗焦虑药物/药物名称",orderNum ="1313")
    private String f4_f14_1_2;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F14苯二氮卓类抗焦虑药物/给药方式",orderNum ="1314")
    private String f4_f14_1_3;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F14苯二氮卓类抗焦虑药物/给药剂量",orderNum ="1315")
    private String f4_f14_1_4;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F14苯二氮卓类抗焦虑药物/开始用药时间",orderNum ="1316")
    private String f4_f14_1_5;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F14苯二氮卓类抗焦虑药物/是否规律用药",orderNum ="1317")
    private String f4_f14_1_6;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F14苯二氮卓类抗焦虑药物/是否停药",orderNum ="1318")
    private String f4_f14_1_7;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F14苯二氮卓类抗焦虑药物/停药时间",orderNum ="1319")
    private String f4_f14_1_8;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F14苯二氮卓类抗焦虑药物/疾病控制情况",orderNum ="1320")
    private String f4_f14_1_9;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F15丁苯酞软胶囊/",orderNum ="1321")
    private String f4_f15_1_1;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F15丁苯酞软胶囊/给药方式",orderNum ="1322")
    private String f4_f15_1_2;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F15丁苯酞软胶囊/给药剂量",orderNum ="1323")
    private String f4_f15_1_3;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F15丁苯酞软胶囊/开始用药时间",orderNum ="1324")
    private String f4_f15_1_4;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F15丁苯酞软胶囊/是否规律用药",orderNum ="1325")
    private String f4_f15_1_5;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F15丁苯酞软胶囊/是否停药",orderNum ="1326")
    private String f4_f15_1_6;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F15丁苯酞软胶囊/停药时间",orderNum ="1327")
    private String f4_f15_1_7;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F15丁苯酞软胶囊/疾病控制情况",orderNum ="1328")
    private String f4_f15_1_8;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F16维生素B12/",orderNum ="1329")
    private String f4_f16_1_1;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F16维生素B12/给药方式",orderNum ="1330")
    private String f4_f16_1_2;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F16维生素B12/给药剂量",orderNum ="1331")
    private String f4_f16_1_3;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F16维生素B12/开始用药时间",orderNum ="1332")
    private String f4_f16_1_4;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F16维生素B12/是否规律用药",orderNum ="1333")
    private String f4_f16_1_5;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F16维生素B12/是否停药",orderNum ="1334")
    private String f4_f16_1_6;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F16维生素B12/停药时间",orderNum ="1335")
    private String f4_f16_1_7;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F16维生素B12/疾病控制情况",orderNum ="1336")
    private String f4_f16_1_8;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F17其他可能影响认知功能的药物/",orderNum ="1337")
    private String f4_f17_1_1;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F17其他可能影响认知功能的药物/药物名称",orderNum ="1338")
    private String f4_f17_1_2;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F17其他可能影响认知功能的药物/给药方式",orderNum ="1339")
    private String f4_f17_1_3;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F17其他可能影响认知功能的药物/给药剂量",orderNum ="1340")
    private String f4_f17_1_4;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F17其他可能影响认知功能的药物/开始用药时间",orderNum ="1341")
    private String f4_f17_1_5;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F17其他可能影响认知功能的药物/是否规律用药",orderNum ="1342")
    private String f4_f17_1_6;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F17其他可能影响认知功能的药物/是否停药",orderNum ="1343")
    private String f4_f17_1_7;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F17其他可能影响认知功能的药物/停药时间",orderNum ="1344")
    private String f4_f17_1_8;
    @Excel(name = "认知障碍报告表/F认知障碍用药情况/F17其他可能影响认知功能的药物/疾病控制情况",orderNum ="1345")
    private String f4_f17_1_9;
    @Excel(name = "认知障碍报告表/G 体格检查/G1身高（cm）",orderNum ="1346")
    private String f4_g_1;
    @Excel(name = "认知障碍报告表/G 体格检查/G2体重（kg）",orderNum ="1347")
    private String f4_g_2;
    @Excel(name = "认知障碍报告表/G 体格检查/G3腰围（寸）",orderNum ="1348")
    private String f4_g_3;
    @Excel(name = "认知障碍报告表/G 体格检查/G4.1血压/收缩压（mmHg）",orderNum ="1349")
    private String f4_g_4;
    @Excel(name = "认知障碍报告表/G 体格检查/G4.2血压/舒张压（mmHg",orderNum ="1350")
    private String f4_g_5;
    @Excel(name = "认知障碍报告表/G 体格检查/G5静息心率（次/分）",orderNum ="1351")
    private String f4_g_6;
    @Excel(name = "认知障碍报告表/G 体格检查/G6受试的视觉功能是否正常",orderNum ="1352")
    private String f4_g_7;
    @Excel(name = "认知障碍报告表/G 体格检查/G7受试的听觉功能是否正常",orderNum ="1353")
    private String f4_g_8;
    @Excel(name = "认知障碍报告表/G 体格检查/G8.1意识水平",orderNum ="1354")
    private String f4_g_9;
    @Excel(name = "认知障碍报告表/G 体格检查/语言",orderNum ="1355")
    private String f4_g_10;
    @Excel(name = "认知障碍报告表/G 体格检查/语言1异常",orderNum ="1356")
    private String f4_g_11;
    @Excel(name = "认知障碍报告表/G 体格检查/脑膜刺激",orderNum ="1357")
    private String f4_g_12;
    @Excel(name = "认知障碍报告表/G 体格检查/脑膜刺激0阴性",orderNum ="1358")
    private String f4_g_13;
    @Excel(name = "认知障碍报告表/G 体格检查/G8.2颅神经",orderNum ="1359")
    private String f4_g_14;
    @Excel(name = "认知障碍报告表/G 体格检查/G8.2颅神经1异常",orderNum ="1360")
    private String f4_g_15;
    @Excel(name = "认知障碍报告表/G 体格检查/G8.3运动系统",orderNum ="1361")
    private String f4_g_16;
    @Excel(name = "认知障碍报告表/G 体格检查/G8.3运动系统1异常",orderNum ="1362")
    private String f4_g_17;
    @Excel(name = "认知障碍报告表/G 体格检查/G8.4病理征",orderNum ="1363")
    private String f4_g_18;
    @Excel(name = "认知障碍报告表/G 体格检查/G8.4病理征1阳性",orderNum ="1364")
    private String f4_g_19;
    @Excel(name = "认知障碍报告表/G 体格检查/G8.5感觉",orderNum ="1365")
    private String f4_g_20;
    @Excel(name = "认知障碍报告表/G 体格检查/G8.5感觉1异常",orderNum ="1366")
    private String f4_g_21;
    @Excel(name = "认知障碍报告表/G 体格检查/G8.6步态",orderNum ="1367")
    private String f4_g_22;
    @Excel(name = "认知障碍报告表/G 体格检查/G8.6步态1异常",orderNum ="1368")
    private String f4_g_23;
    @Excel(name = "认知障碍报告表/L影像检查/L1血管超声/L1.1仪器型号",orderNum ="1369")
    private String f4_l_1;
    @Excel(name = "认知障碍报告表/L影像检查/L1血管超声/L1.2探头型号",orderNum ="1370")
    private String f4_l_2;
    @Excel(name = "认知障碍报告表/L影像检查/L1血管超声/L1.3探头频率(MHz)",orderNum ="1371")
    private String f4_l_3;
    @Excel(name = "认知障碍报告表/L影像检查/内-中膜厚度 IMT（mm）/颈动脉球部(左)",orderNum ="1372")
    private String f4_l_4;
    @Excel(name = "认知障碍报告表/L影像检查/内-中膜厚度 IMT（mm）/颈动脉球部(右)",orderNum ="1373")
    private String f4_l_5;
    @Excel(name = "认知障碍报告表/L影像检查/内-中膜厚度 IMT（mm）/颈内动脉(左)",orderNum ="1374")
    private String f4_l_6;
    @Excel(name = "认知障碍报告表/L影像检查/内-中膜厚度 IMT（mm）/颈内动脉(右)",orderNum ="1375")
    private String f4_l_7;
    @Excel(name = "认知障碍报告表/L影像检查/内-中膜厚度 IMT（mm）/颈总动脉(左)",orderNum ="1376")
    private String f4_l_8;
    @Excel(name = "认知障碍报告表/L影像检查/内-中膜厚度 IMT（mm）/颈总动脉(右)",orderNum ="1377")
    private String f4_l_9;
    @Excel(name = "认知障碍报告表/L影像检查/血流速度-PSV（cm/s）/颈动脉球部(左)",orderNum ="1378")
    private String f4_l_10;
    @Excel(name = "认知障碍报告表/L影像检查/血流速度-PSV（cm/s）/颈动脉球部(右)",orderNum ="1379")
    private String f4_l_11;
    @Excel(name = "认知障碍报告表/L影像检查/血流速度-PSV（cm/s）/颈内动脉(左)",orderNum ="1380")
    private String f4_l_12;
    @Excel(name = "认知障碍报告表/L影像检查/血流速度-PSV（cm/s）/颈内动脉(右)",orderNum ="1381")
    private String f4_l_13;
    @Excel(name = "认知障碍报告表/L影像检查/血流速度-PSV（cm/s）/颈总动脉(左)",orderNum ="1382")
    private String f4_l_14;
    @Excel(name = "认知障碍报告表/L影像检查/血流速度-PSV（cm/s）/颈总动脉(右)",orderNum ="1383")
    private String f4_l_15;
    @Excel(name = "认知障碍报告表/L影像检查/血流速度-EDV（cm/s）/颈动脉球部(左)",orderNum ="1384")
    private String f4_l_16;
    @Excel(name = "认知障碍报告表/L影像检查/血流速度-EDV（cm/s）/颈动脉球部(右)",orderNum ="1385")
    private String f4_l_17;
    @Excel(name = "认知障碍报告表/L影像检查/血流速度-EDV（cm/s）/颈内动脉(左)",orderNum ="1386")
    private String f4_l_18;
    @Excel(name = "认知障碍报告表/L影像检查/血流速度-EDV（cm/s）/颈内动脉(右)",orderNum ="1387")
    private String f4_l_19;
    @Excel(name = "认知障碍报告表/L影像检查/血流速度-EDV（cm/s）/颈总动脉(左)",orderNum ="1388")
    private String f4_l_20;
    @Excel(name = "认知障碍报告表/L影像检查/血流速度-EDV（cm/s）/颈总动脉(右)",orderNum ="1389")
    private String f4_l_21;
    @Excel(name = "认知障碍报告表/L影像检查/斑块性质-直径/颈动脉球部(左)",orderNum ="1390")
    private String f4_l_22;
    @Excel(name = "认知障碍报告表/L影像检查/斑块性质-直径/颈动脉球部(右)",orderNum ="1391")
    private String f4_l_23;
    @Excel(name = "认知障碍报告表/L影像检查/斑块性质-直径/颈内动脉(左)",orderNum ="1392")
    private String f4_l_24;
    @Excel(name = "认知障碍报告表/L影像检查/斑块性质-直径/颈内动脉(右)",orderNum ="1393")
    private String f4_l_25;
    @Excel(name = "认知障碍报告表/L影像检查/斑块性质-直径/颈总动脉(左)",orderNum ="1394")
    private String f4_l_26;
    @Excel(name = "认知障碍报告表/L影像检查/斑块性质-直径/颈总动脉(右)",orderNum ="1395")
    private String f4_l_27;
    @Excel(name = "认知障碍报告表/L影像检查/斑块性质-数目/颈动脉球部(左)",orderNum ="1396")
    private String f4_l_28;
    @Excel(name = "认知障碍报告表/L影像检查/斑块性质-数目/颈动脉球部(右)",orderNum ="1397")
    private String f4_l_29;
    @Excel(name = "认知障碍报告表/L影像检查/斑块性质-数目/颈内动脉(左)",orderNum ="1398")
    private String f4_l_30;
    @Excel(name = "认知障碍报告表/L影像检查/斑块性质-数目/颈内动脉(右)",orderNum ="1399")
    private String f4_l_31;
    @Excel(name = "认知障碍报告表/L影像检查/斑块性质-数目/颈总动脉(左)",orderNum ="1400")
    private String f4_l_32;
    @Excel(name = "认知障碍报告表/L影像检查/斑块性质-数目/颈总动脉(右)",orderNum ="1401")
    private String f4_l_33;
    @Excel(name = "认知障碍报告表/L影像检查/斑块性质-声波性质/颈动脉球部(左)",orderNum ="1402")
    private String f4_l_34;
    @Excel(name = "认知障碍报告表/L影像检查/斑块性质-声波性质/颈动脉球部(右)",orderNum ="1403")
    private String f4_l_35;
    @Excel(name = "认知障碍报告表/L影像检查/斑块性质-声波性质/颈内动脉(左)",orderNum ="1404")
    private String f4_l_36;
    @Excel(name = "认知障碍报告表/L影像检查/斑块性质-声波性质/颈内动脉(右)",orderNum ="1405")
    private String f4_l_37;
    @Excel(name = "认知障碍报告表/L影像检查/斑块性质-声波性质/颈总动脉(左)",orderNum ="1406")
    private String f4_l_38;
    @Excel(name = "认知障碍报告表/L影像检查/斑块性质-声波性质/颈总动脉(右)",orderNum ="1407")
    private String f4_l_39;
    @Excel(name = "认知障碍报告表/L影像检查/患者颈动脉超声报告电子版/",orderNum ="1408")
    private String f4_l_40;
    @Excel(name = "认知障碍报告表/L影像检查/L2头颅MRI/L2.1影像号",orderNum ="1409")
    private String f4_l_41;
    @Excel(name = "认知障碍报告表/L影像检查/L2头颅MRI/L2.2扫描日期",orderNum ="1410")
    private String f4_l_42;
    @Excel(name = "认知障碍报告表/L影像检查/L2头颅MRI/L2.3扫描地点",orderNum ="1411")
    private String f4_l_43;
    @Excel(name = "认知障碍报告表/L影像检查/L2头颅MRI/L2.4数据上传",orderNum ="1412")
    private String f4_l_44;
    @Excel(name = "认知障碍报告表/L影像检查/L2头颅MRI/L2.5描述",orderNum ="1413")
    private String f4_l_45;
    @Excel(name = "认知障碍报告表/L影像检查/L2头颅MRI/L2.6结论",orderNum ="1414")
    private String f4_l_46;
    @Excel(name = "认知障碍报告表/L影像检查/L3.1PET检查/",orderNum ="1415")
    private String f4_l_47;
    @Excel(name = "认知障碍报告表/L影像检查/L3.1PET检查/4其他",orderNum ="1416")
    private String f4_l_49;
    @Excel(name = "认知障碍报告表/L影像检查/L3.2显影剂/",orderNum ="1417")
    private String f4_l_50;
    @Excel(name = "认知障碍报告表/L影像检查/L3.2显影剂/3其他",orderNum ="1418")
    private String f4_l_51;
    @Excel(name = "认知障碍报告表/L影像检查/L3.3影像号/",orderNum ="1419")
    private String f4_l_52;
    @Excel(name = "认知障碍报告表/L影像检查/L3.4扫描地点",orderNum ="1420")
    private String f4_l_53;
    @Excel(name = "认知障碍报告表/L影像检查/L3.5扫描日期",orderNum ="1421")
    private String f4_l_54;
    @Excel(name = "认知障碍报告表/L影像检查/L3.6数据上传",orderNum ="1422")
    private String f4_l_55;
    @Excel(name = "认知障碍报告表/L影像检查/L3.7描述",orderNum ="1423")
    private String f4_l_57;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M1空腹血糖（Glu/mmol/L）",orderNum ="1424")
    private String f4_m_1;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M2糖化血红蛋白（HbAlc/%）",orderNum ="1425")
    private String f4_m_2;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M3总胆固醇（TC/mmol/L",orderNum ="1426")
    private String f4_m_3;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M4低密度脂蛋白胆固醇（LDL-C/mmol/L）",orderNum ="1427")
    private String f4_m_4;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M5高密度脂蛋白胆固醇（HDL-C/mmol/L）",orderNum ="1428")
    private String f4_m_5;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M6游离脂肪酸(FFA/mmol/L)",orderNum ="1429")
    private String f4_m_6;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M7甘油三酯（TG/mmol/L）",orderNum ="1430")
    private String f4_m_7;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M8尿素氮（BUN/mmol/L）",orderNum ="1431")
    private String f4_m_8;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M9肌酐（Crea/umol/L）",orderNum ="1432")
    private String f4_m_9;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M10尿酸（UA/umol/L）",orderNum ="1433")
    private String f4_m_10;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M11谷丙转氨酶（ALT/IU/L）",orderNum ="1434")
    private String f4_m_11;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M12谷草转氨酶(AST/IU/L)",orderNum ="1435")
    private String f4_m_12;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M13总胆红素(TBiL/umol/L)",orderNum ="1436")
    private String f4_m_13;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M14直接胆红素(DBiL/umol/L)",orderNum ="1437")
    private String f4_m_14;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M15碱性磷酸酶(ALP/IU/L)",orderNum ="1438")
    private String f4_m_15;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M16γ-谷氨酰转移酶(γ-GT/mmol/L)",orderNum ="1439")
    private String f4_m_16;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M17血清白蛋白(ALB/g/L)",orderNum ="1440")
    private String f4_m_17;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M18游离三碘甲状腺原氨酸(FT3/nmol/L)",orderNum ="1441")
    private String f4_m_18;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M19游离甲状腺素（FT4/nmol/L）",orderNum ="1442")
    private String f4_m_19;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M20血清总 T3(TT3/nmol/L)",orderNum ="1443")
    private String f4_m_20;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M21血清总 T4(TT4/nmol/L)",orderNum ="1444")
    private String f4_m_21;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M22促甲状腺素（TSH/mIU/L）",orderNum ="1445")
    private String f4_m_22;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M23维生素 B12(VitB12/mmol/L)",orderNum ="1446")
    private String f4_m_23;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/24叶酸/mmol/L",orderNum ="1447")
    private String f4_m_24;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M25同型半胱氨酸/mmol/L",orderNum ="1448")
    private String f4_m_25;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M26镁（Mg2+）/mmol/L",orderNum ="1449")
    private String f4_m_26;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M27钙（Ca2+）/mmol/L",orderNum ="1450")
    private String f4_m_27;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M28钾（K+）/mmol/L",orderNum ="1451")
    private String f4_m_28;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M29钠（Na+）/mmol/L",orderNum ="1452")
    private String f4_m_29;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M30C 反应蛋白（CRP）/mg/ml",orderNum ="1453")
    private String f4_m_30;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M31超敏 C 反应蛋白（HCRP）/ug/ml",orderNum ="1454")
    private String f4_m_31;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M32梅毒抗体",orderNum ="1455")
    private String f4_m_32;
    @Excel(name = "认知障碍报告表/M实验室检查/血清/M33HIV 抗体",orderNum ="1456")
    private String f4_m_33;
    @Excel(name = "认知障碍报告表/M实验室检查/血浆-凝血/M34凝血酶原时间（PT）",orderNum ="1457")
    private String f4_m_34;
    @Excel(name = "认知障碍报告表/M实验室检查/血浆-凝血/M35活化部分凝血活酶时间（APTT）",orderNum ="1458")
    private String f4_m_35;
    @Excel(name = "认知障碍报告表/M实验室检查/血浆-凝血/M36凝血酶时间（TT）",orderNum ="1459")
    private String f4_m_36;
    @Excel(name = "认知障碍报告表/M实验室检查/血浆-凝血/M37纤维蛋白原（FIB）",orderNum ="1460")
    private String f4_m_37;
    @Excel(name = "认知障碍报告表/M实验室检查/血浆-凝血/M38D-二聚体",orderNum ="1461")
    private String f4_m_38;
    @Excel(name = "认知障碍报告表/M实验室检查/脑脊液/",orderNum ="1462")
    private String f4_m_39;
    @Excel(name = "认知障碍报告表/M实验室检查/脑脊液/M42脑脊液外观",orderNum ="1463")
    private String f4_m_40;
    @Excel(name = "认知障碍报告表/M实验室检查/脑脊液/M43腰穿压力mmH2O",orderNum ="1464")
    private String f4_m_41;
    @Excel(name = "认知障碍报告表/M实验室检查/脑脊液/M44细胞数106/L",orderNum ="1465")
    private String f4_m_42;
    @Excel(name = "认知障碍报告表/M实验室检查/脑脊液/M45淋巴细胞比例/%",orderNum ="1466")
    private String f4_m_43;
    @Excel(name = "认知障碍报告表/M实验室检查/脑脊液/M46中性粒细胞比例/%",orderNum ="1467")
    private String f4_m_44;
    @Excel(name = "认知障碍报告表/M实验室检查/脑脊液/M47蛋白g/L",orderNum ="1468")
    private String f4_m_45;
    @Excel(name = "认知障碍报告表/M实验室检查/脑脊液/氯化物mmol/L",orderNum ="1469")
    private String f4_m_47;
    @Excel(name = "认知障碍报告表/N临床诊断/N1 受试的认知功能",orderNum ="1470")
    private String f4_n_1_1;
    @Excel(name = "认知障碍报告表/N临床诊断/N2 轻度认知障碍分类",orderNum ="1471")
    private String n2;
    @Excel(name = "认知障碍报告表/N临床诊断/N3痴呆分类",orderNum ="1472")
    private String n3;
    @Excel(name = "认知障碍报告表/N临床诊断/医师签字",orderNum ="1473")
    private String n331;
    @Excel(name = "认知障碍报告表/N临床诊断/检查日期",orderNum ="1474")
    private String n332;
}