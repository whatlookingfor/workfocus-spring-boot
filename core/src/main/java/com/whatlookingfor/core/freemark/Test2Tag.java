/**
 * Copyright  2014-2016 whatlookingfor@gmail.com(Jonathan)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.whatlookingfor.core.freemark;

import com.google.common.collect.Lists;
import com.whatlookingfor.modules.sys.entity.User;
import freemarker.ext.beans.BeansWrapperBuilder;
import freemarker.ext.beans.StringModel;
import freemarker.template.*;

import java.util.Collection;
import java.util.List;

/**
 * TODO
 *
 * @author Jonathan
 * @version 2016/6/7 17:00
 * @since JDK 7.0+
 */
public class Test2Tag implements TemplateMethodModelEx{
	@Override
	public TemplateModel exec(List args) throws TemplateModelException {
		User user1=new User();
		user1.setName("asdas");

		User user2=new User();
		user2.setName("qqqq");
		SimpleSequence userList=new SimpleSequence(new DefaultObjectWrapperBuilder(Configuration.VERSION_2_3_23).build());
		userList.add(user1);
		userList.add(user2);
		return userList;
	}
}
