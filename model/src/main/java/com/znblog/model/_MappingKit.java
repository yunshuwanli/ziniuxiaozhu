package com.znblog.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {

	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("lesson_eval", "id", LessonEval.class);
		arp.addMapping("lessons", "id", Lessons.class);
		arp.addMapping("lessons_plan", "id", LessonsPlan.class);
		arp.addMapping("lessons_type", "id", LessonsType.class);
		arp.addMapping("user_base", "id", UserBase.class);
		arp.addMapping("zn_article", "id", ZnArticle.class);
		arp.addMapping("zn_comment", "id", ZnComment.class);
		arp.addMapping("zn_judge", "id", ZnJudge.class);
		arp.addMapping("zn_lessons", "id", ZnLessons.class);
		arp.addMapping("zn_lessons_plan", "id", ZnLessonsPlan.class);
		arp.addMapping("zn_user_base", "id", ZnUserBase.class);
		arp.addMapping("zn_week_ana", "id", ZnWeekAna.class);
		arp.addMapping("zn_weekly_report", "id", ZnWeeklyReport.class);
		arp.addMapping("zn_weekreports", "ID", ZnWeekreports.class);
	}
}

