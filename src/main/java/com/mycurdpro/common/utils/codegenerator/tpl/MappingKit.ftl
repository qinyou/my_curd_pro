package ${(basePackageName)!}.${(moduleName)!}.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated MappingKit
 * ${(moduleName)!} 模块数据表  MappingKit
 * @author ${(author)!'Generator'}
 */
public class ${(moduleName)?cap_first}MappingKit {

	public static void mapping(ActiveRecordPlugin arp) {
<#if (tableMetas)??>
    <#list tableMetas as tableMeta>
        // ${(tableMeta.remark)!}
		arp.addMapping("${(tableMeta.name)!}", "${(tableMeta.primaryKeys)?join(",")}", ${(tableMeta.nameCamelFirstUp)!}.class);
    </#list>
</#if>
	}
}

