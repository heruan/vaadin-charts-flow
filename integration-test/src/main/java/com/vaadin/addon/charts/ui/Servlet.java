/*
 * Copyright 2000-2017 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.addon.charts.ui;

import com.vaadin.addon.charts.ui.Servlet.MyRouterConfigurator;
import com.vaadin.flow.router.RouterConfiguration;
import com.vaadin.flow.router.RouterConfigurator;
import com.vaadin.server.VaadinServlet;
import com.vaadin.server.VaadinServletConfiguration;

import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/*", name = "UIServlet", asyncSupported = true)
@VaadinServletConfiguration(routerConfigurator = MyRouterConfigurator.class, productionMode = false)
public class Servlet extends VaadinServlet {

	/**
	 * The router configurator defines the how to map URLs to views.
	 */
	public static class MyRouterConfigurator implements RouterConfigurator {
		@Override
		public void configure(RouterConfiguration configuration) {
			/*
			 * For the root, only show the main view without any sub view
			 */
			configuration.setRoute("", MainView.class);
		}
	}
}
