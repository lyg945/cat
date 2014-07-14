package com.dianping.cat.build;

import java.util.ArrayList;
import java.util.List;

import org.unidal.dal.jdbc.configuration.AbstractJdbcResourceConfigurator;
import org.unidal.lookup.configuration.Component;

final class CatDatabaseConfigurator extends AbstractJdbcResourceConfigurator {
   @Override
   public List<Component> defineComponents() {
      List<Component> all = new ArrayList<Component>();

      defineSimpleTableProviderComponents(all, "cat", com.dianping.cat.home.dal.report._INDEX.getEntityClasses());
      defineDaoComponents(all, com.dianping.cat.home.dal.report._INDEX.getDaoClasses());

      defineSimpleTableProviderComponents(all, "cat", com.dianping.cat.home.dal.alarm._INDEX.getEntityClasses());
      defineDaoComponents(all, com.dianping.cat.home.dal.alarm._INDEX.getDaoClasses());

      defineSimpleTableProviderComponents(all, "app", com.dianping.cat.core.dal._INDEX.getEntityClasses());
      defineDaoComponents(all, com.dianping.cat.core.dal._INDEX.getDaoClasses());

      return all;
   }
}
