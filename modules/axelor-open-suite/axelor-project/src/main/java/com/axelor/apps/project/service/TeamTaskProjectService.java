/*
 * Axelor Business Solutions
 *
 * Copyright (C) 2019 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.axelor.apps.project.service;

import com.axelor.apps.base.service.TeamTaskService;
import com.axelor.apps.project.db.Project;
import com.axelor.auth.db.User;
import com.axelor.team.db.TeamTask;

public interface TeamTaskProjectService extends TeamTaskService {
  TeamTask create(String subject, Project project, User assignedTo);
}
