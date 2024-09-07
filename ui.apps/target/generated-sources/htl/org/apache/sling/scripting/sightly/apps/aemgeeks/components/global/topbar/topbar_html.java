/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.aemgeeks.components.global.topbar;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class topbar_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

out.write("\n    <!-- Topbar -->\n        <nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\n\n          <!-- Sidebar Toggle (Topbar) -->\n          <button id=\"sidebarToggleTop\" class=\"btn btn-link d-md-none rounded-circle mr-3\">\n            <i class=\"fa fa-bars\"></i>\n          </button>\n\n          <!-- Topbar Search -->\n          <form class=\"d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search\">\n            <div class=\"input-group\">\n              <input type=\"text\" class=\"form-control bg-light border-0 small\" placeholder=\"Search for...\" aria-label=\"Search\" aria-describedby=\"basic-addon2\"/>\n              <div class=\"input-group-append\">\n                <button class=\"btn btn-primary\" type=\"button\">\n                  <i class=\"fas fa-search fa-sm\"></i>\n                </button>\n              </div>\n            </div>\n          </form>\n\n          <!-- Topbar Navbar -->\n          <ul class=\"navbar-nav ml-auto\">\n\n            <!-- Nav Item - Search Dropdown (Visible Only XS) -->\n            <li class=\"nav-item dropdown no-arrow d-sm-none\">\n              <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"searchDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n                <i class=\"fas fa-search fa-fw\"></i>\n              </a>\n              <!-- Dropdown - Messages -->\n              <div class=\"dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in\" aria-labelledby=\"searchDropdown\">\n                <form class=\"form-inline mr-auto w-100 navbar-search\">\n                  <div class=\"input-group\">\n                    <input type=\"text\" class=\"form-control bg-light border-0 small\" placeholder=\"Search for...\" aria-label=\"Search\" aria-describedby=\"basic-addon2\"/>\n                    <div class=\"input-group-append\">\n                      <button class=\"btn btn-primary\" type=\"button\">\n                        <i class=\"fas fa-search fa-sm\"></i>\n                      </button>\n                    </div>\n                  </div>\n                </form>\n              </div>\n            </li>\n\n            <!-- Nav Item - Alerts -->\n            <li class=\"nav-item dropdown no-arrow mx-1\">\n              <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"alertsDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n                <i class=\"fas fa-bell fa-fw\"></i>\n                <!-- Counter - Alerts -->\n                <span class=\"badge badge-danger badge-counter\">3+</span>\n              </a>\n              <!-- Dropdown - Alerts -->\n              <div class=\"dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in\" aria-labelledby=\"alertsDropdown\">\n                <h6 class=\"dropdown-header\">\n                  Alerts Center\n                </h6>\n                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n                  <div class=\"mr-3\">\n                    <div class=\"icon-circle bg-primary\">\n                      <i class=\"fas fa-file-alt text-white\"></i>\n                    </div>\n                  </div>\n                  <div>\n                    <div class=\"small text-gray-500\">December 12, 2019</div>\n                    <span class=\"font-weight-bold\">A new monthly report is ready to download!</span>\n                  </div>\n                </a>\n                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n                  <div class=\"mr-3\">\n                    <div class=\"icon-circle bg-success\">\n                      <i class=\"fas fa-donate text-white\"></i>\n                    </div>\n                  </div>\n                  <div>\n                    <div class=\"small text-gray-500\">December 7, 2019</div>\n                    $290.29 has been deposited into your account!\n                  </div>\n                </a>\n                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n                  <div class=\"mr-3\">\n                    <div class=\"icon-circle bg-warning\">\n                      <i class=\"fas fa-exclamation-triangle text-white\"></i>\n                    </div>\n                  </div>\n                  <div>\n                    <div class=\"small text-gray-500\">December 2, 2019</div>\n                    Spending Alert: We've noticed unusually high spending for your account.\n                  </div>\n                </a>\n                <a class=\"dropdown-item text-center small text-gray-500\" href=\"#\">Show All Alerts</a>\n              </div>\n            </li>\n\n            <!-- Nav Item - Messages -->\n            <li class=\"nav-item dropdown no-arrow mx-1\">\n              <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"messagesDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n                <i class=\"fas fa-envelope fa-fw\"></i>\n                <!-- Counter - Messages -->\n                <span class=\"badge badge-danger badge-counter\">7</span>\n              </a>\n              <!-- Dropdown - Messages -->\n              <div class=\"dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in\" aria-labelledby=\"messagesDropdown\">\n                <h6 class=\"dropdown-header\">\n                  Message Center\n                </h6>\n                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n                  <div class=\"dropdown-list-image mr-3\">\n                    <img class=\"rounded-circle\" src=\"https://source.unsplash.com/fn_BT9fwg_E/60x60\" alt=\"\"/>\n                    <div class=\"status-indicator bg-success\"></div>\n                  </div>\n                  <div class=\"font-weight-bold\">\n                    <div class=\"text-truncate\">Hi there! I am wondering if you can help me with a problem I've been having.</div>\n                    <div class=\"small text-gray-500\">Emily Fowler \u00B7 58m</div>\n                  </div>\n                </a>\n                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n                  <div class=\"dropdown-list-image mr-3\">\n                    <img class=\"rounded-circle\" src=\"https://source.unsplash.com/AU4VPcFN4LE/60x60\" alt=\"\"/>\n                    <div class=\"status-indicator\"></div>\n                  </div>\n                  <div>\n                    <div class=\"text-truncate\">I have the photos that you ordered last month, how would you like them sent to you?</div>\n                    <div class=\"small text-gray-500\">Jae Chun \u00B7 1d</div>\n                  </div>\n                </a>\n                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n                  <div class=\"dropdown-list-image mr-3\">\n                    <img class=\"rounded-circle\" src=\"https://source.unsplash.com/CS2uCrpNzJY/60x60\" alt=\"\"/>\n                    <div class=\"status-indicator bg-warning\"></div>\n                  </div>\n                  <div>\n                    <div class=\"text-truncate\">Last month's report looks great, I am very happy with the progress so far, keep up the good work!</div>\n                    <div class=\"small text-gray-500\">Morgan Alvarez \u00B7 2d</div>\n                  </div>\n                </a>\n                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n                  <div class=\"dropdown-list-image mr-3\">\n                    <img class=\"rounded-circle\" src=\"https://source.unsplash.com/Mv9hjnEUHR4/60x60\" alt=\"\"/>\n                    <div class=\"status-indicator bg-success\"></div>\n                  </div>\n                  <div>\n                    <div class=\"text-truncate\">Am I a good boy? The reason I ask is because someone told me that people say this to all dogs, even if they aren't good...</div>\n                    <div class=\"small text-gray-500\">Chicken the Dog \u00B7 2w</div>\n                  </div>\n                </a>\n                <a class=\"dropdown-item text-center small text-gray-500\" href=\"#\">Read More Messages</a>\n              </div>\n            </li>\n\n            <div class=\"topbar-divider d-none d-sm-block\"></div>\n\n            <!-- Nav Item - User Information -->\n            <li class=\"nav-item dropdown no-arrow\">\n              <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n                <span class=\"mr-2 d-none d-lg-inline text-gray-600 small\">Valerie Luna</span>\n                <img class=\"img-profile rounded-circle\" src=\"https://source.unsplash.com/QAB-WJcbgJk/60x60\"/>\n              </a>\n              <!-- Dropdown - User Information -->\n              <div class=\"dropdown-menu dropdown-menu-right shadow animated--grow-in\" aria-labelledby=\"userDropdown\">\n                <a class=\"dropdown-item\" href=\"#\">\n                  <i class=\"fas fa-user fa-sm fa-fw mr-2 text-gray-400\"></i>\n                  Profile\n                </a>\n                <a class=\"dropdown-item\" href=\"#\">\n                  <i class=\"fas fa-cogs fa-sm fa-fw mr-2 text-gray-400\"></i>\n                  Settings\n                </a>\n                <a class=\"dropdown-item\" href=\"#\">\n                  <i class=\"fas fa-list fa-sm fa-fw mr-2 text-gray-400\"></i>\n                  Activity Log\n                </a>\n                <div class=\"dropdown-divider\"></div>\n                <a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\" data-target=\"#logoutModal\">\n                  <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i>\n                  Logout\n                </a>\n              </div>\n            </li>\n\n          </ul>\n\n        </nav>\n        <!-- End of Topbar -->");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

