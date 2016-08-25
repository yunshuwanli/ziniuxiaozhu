package com.znblog.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseZnWeeklyReport<M extends BaseZnWeeklyReport<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setReportWriter(java.lang.String reportWriter) {
		set("report_writer", reportWriter);
	}

	public java.lang.String getReportWriter() {
		return get("report_writer");
	}

	public void setReportThisWeek(java.lang.String reportThisWeek) {
		set("report_this_week", reportThisWeek);
	}

	public java.lang.String getReportThisWeek() {
		return get("report_this_week");
	}

	public void setReportNextWeek(java.lang.String reportNextWeek) {
		set("report_next_week", reportNextWeek);
	}

	public java.lang.String getReportNextWeek() {
		return get("report_next_week");
	}

	public void setReportDifficulty(java.lang.String reportDifficulty) {
		set("report_difficulty", reportDifficulty);
	}

	public java.lang.String getReportDifficulty() {
		return get("report_difficulty");
	}

	public void setReportTime(java.util.Date reportTime) {
		set("report_time", reportTime);
	}

	public java.util.Date getReportTime() {
		return get("report_time");
	}

}
