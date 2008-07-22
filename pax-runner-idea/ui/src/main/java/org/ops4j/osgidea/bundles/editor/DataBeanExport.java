/*
 * Copyright 2006 Niclas Hedhman.
 *
 * Licensed  under the  Apache License,  Version 2.0  (the "License");
 * you may not use  this file  except in  compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed  under the  License is distributed on an "AS IS" BASIS,
 * WITHOUT  WARRANTIES OR CONDITIONS  OF ANY KIND, either  express  or
 * implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ops4j.osgidea.bundles.editor;

import java.util.ArrayList;
import java.util.Set;
import org.ops4j.osgidea.module.packages.PackageInfo;

public class DataBeanExport
{
    private ArrayList<PackageInfo> m_packages;

    public DataBeanExport( Set<PackageInfo> packages )
    {
        m_packages = new ArrayList<PackageInfo>();
        m_packages.addAll( packages );
    }

    public ArrayList<PackageInfo> getPackages()
    {
        return m_packages;
    }

    public void setPackages( ArrayList<PackageInfo> packages )
    {
        m_packages = packages;
    }
}