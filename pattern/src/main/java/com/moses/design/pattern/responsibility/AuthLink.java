package com.moses.design.pattern.responsibility;

import com.moses.design.pattern.responsibility.base.AuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 身份验证链接
 *
 * @author fanshaorong
 * @date 2021/02/05
 */
public abstract class AuthLink {
    protected Logger logger = LoggerFactory.getLogger(AuthLink.class);
    //总经理
    public static int GENERAL_MANAGER = 1;
    //项目经理
    public static int PROJECT_MANAGER = 2;
    //主管
    public static int DIRECTOR = 3;
    //责任链中的下一个元素
    private AuthLink next;
    protected int level;
    protected String userId;                           // 级别人员ID
    protected String userName;                         // 级别人员姓名

    public AuthLink(int level, String userId, String userName) {
        this.level = level;
        this.userId = userId;
        this.userName = userName;
    }

    public void setNext(AuthLink next) {
        this.next = next;
    }

    public void doAuth(int level, String uId, String orderId) {
        if (this.level <= level) {
            approval(uId, orderId);
        }
        if (next != null && approved(uId)) {
            next.doAuth(level, uId, orderId);
        }
    }

    protected abstract void approval(String uId, String orderId);

    private boolean approved(String uId) {
        AuthInfo authInfo = AuthService.queryAuthInfo(uId);
        return authInfo != null && authInfo.getStatus().equals("agree");
    }

    public AuthInfo getInfo(String status, String uId, String orderId) {
        return new AuthInfo(status, "单号：", orderId, " 申请人：", uId, " 级别：", String.valueOf(level), " 时间：", DateUtil.getDate(), " 审批人：", userName);
    }
}
