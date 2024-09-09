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
package org.apache.sling.scripting.sightly.apps.aemgeeks.components.content.shoppable__002d__video;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class shoppable__002d__video_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Collection var_collectionvar4_list_coerced$ = null;
out.write("<div class=\"shoppable-video\">\n    <!-- Adapt the model in HTL -->\n    <!-- Adapt the resource to ShoppableVideoModel -->\n    ");
_global_model = renderContext.call("use", com.aem.geeks.core.models.ShoppableVideoModel.class.getName(), obj());
out.write("\n\n    <!-- Use videoFile from the Sling Model -->\n    <video controls id=\"videoElement\">\n        <source");
{
    Object var_attrvalue0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "videoFile"), "uri");
    {
        Object var_shoulddisplayattr3 = ((renderContext.getObjectModel().toBoolean(var_attrvalue0) ? var_attrvalue0 : ("false".equals(var_attrvalue0))));
        if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr3)) {
            out.write(" src");
            {
                boolean var_istrueattr2 = (var_attrvalue0.equals(true));
                if (!var_istrueattr2) {
                    out.write("=\"");
                    out.write(renderContext.getObjectModel().toString(var_attrvalue0));
                    out.write("\"");
                }
            }
        }
    }
}
out.write(" type=\"video/mp4\"/>\n        Your browser does not support the video tag.\n    </video>\n\n    <!-- Render shoppable media data -->\n    <div id=\"shoppable-media\" class=\"shoppable-media\">\n        ");
{
    Object var_collectionvar4 = renderContext.getObjectModel().resolveProperty(_global_model, "shoppableMedia");
    {
        long var_size5 = ((var_collectionvar4_list_coerced$ == null ? (var_collectionvar4_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar4)) : var_collectionvar4_list_coerced$).size());
        {
            boolean var_notempty6 = (var_size5 > 0);
            if (var_notempty6) {
                {
                    long var_end9 = var_size5;
                    {
                        boolean var_validstartstepend10 = (((0 < var_size5) && true) && (var_end9 > 0));
                        if (var_validstartstepend10) {
                            if (var_collectionvar4_list_coerced$ == null) {
                                var_collectionvar4_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar4);
                            }
                            long var_index11 = 0;
                            for (Object media : var_collectionvar4_list_coerced$) {
                                {
                                    boolean var_traversal13 = (((var_index11 >= 0) && (var_index11 <= var_end9)) && true);
                                    if (var_traversal13) {
                                        out.write("\n            <div class=\"media-item\"");
                                        {
                                            Object var_attrvalue14 = renderContext.getObjectModel().resolveProperty(media, "timecode");
                                            {
                                                Object var_attrcontent15 = renderContext.call("xss", var_attrvalue14, "attribute");
                                                {
                                                    Object var_shoulddisplayattr17 = ((renderContext.getObjectModel().toBoolean(var_attrcontent15) ? var_attrcontent15 : ("false".equals(var_attrvalue14))));
                                                    if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr17)) {
                                                        out.write(" data-timecode");
                                                        {
                                                            boolean var_istrueattr16 = (var_attrvalue14.equals(true));
                                                            if (!var_istrueattr16) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent15));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write(">\n                <a");
                                        {
                                            Object var_attrvalue18 = renderContext.getObjectModel().resolveProperty(media, "productLink");
                                            {
                                                Object var_attrcontent19 = renderContext.call("xss", var_attrvalue18, "uri");
                                                {
                                                    Object var_shoulddisplayattr21 = ((renderContext.getObjectModel().toBoolean(var_attrcontent19) ? var_attrcontent19 : ("false".equals(var_attrvalue18))));
                                                    if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr21)) {
                                                        out.write(" href");
                                                        {
                                                            boolean var_istrueattr20 = (var_attrvalue18.equals(true));
                                                            if (!var_istrueattr20) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent19));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write(" class=\"shoppable-link\">Shop Now</a>\n            </div>\n        ");
                                    }
                                }
                                var_index11++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar4_list_coerced$ = null;
}
out.write("\n    </div>\n</div>\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

