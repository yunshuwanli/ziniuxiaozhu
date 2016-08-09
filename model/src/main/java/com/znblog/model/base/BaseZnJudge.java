package com.znblog.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseZnJudge<M extends BaseZnJudge<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setJudgeWeekreportsId(java.lang.Integer judgeWeekreportsId) {
		set("judge_weekreports_id", judgeWeekreportsId);
	}

	public java.lang.Integer getJudgeWeekreportsId() {
		return get("judge_weekreports_id");
	}

	public void setJudgeCritic(java.lang.String judgeCritic) {
		set("judge_critic", judgeCritic);
	}

	public java.lang.String getJudgeCritic() {
		return get("judge_critic");
	}

	public void setJudgeReply(java.lang.String judgeReply) {
		set("judge_reply", judgeReply);
	}

	public java.lang.String getJudgeReply() {
		return get("judge_reply");
	}

	public void setJudgeMessage(java.lang.String judgeMessage) {
		set("judge_message", judgeMessage);
	}

	public java.lang.String getJudgeMessage() {
		return get("judge_message");
	}

	public void setJudgeTime(java.util.Date judgeTime) {
		set("judge_time", judgeTime);
	}

	public java.util.Date getJudgeTime() {
		return get("judge_time");
	}

}
