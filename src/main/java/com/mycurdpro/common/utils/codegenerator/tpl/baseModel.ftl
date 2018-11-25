package ${(basePackageName)!}.${(moduleName)!}.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

<#-- 必须引入的包 -->
<#if (tableMeta.necessaryImport)??>
    <#list tableMeta.necessaryImport as necessaryImport>
import ${(necessaryImport)!};
    </#list>
</#if>

/**
 * Generated baseModel
 * DB table: ${(tableMeta.name)!}  ${(tableMeta.remark)!}
 * @author ${(author)!'Generator'}
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class Base${(tableMeta.nameCamelFirstUp)!}<M extends Base${(tableMeta.nameCamelFirstUp)!}<M>> extends Model<M> implements IBean {
<#-- get set 方法 -->
<#if (tableMeta.columnMetas)??>
    <#list tableMeta.columnMetas as column>
     // ${(column.remark)!}
     public ${(column.javaTypeShortName)!} get${(column.nameCamelFirstUp)!}() {
        return get("${(column.name)!}");
     }
     public M set${(column.nameCamelFirstUp)!}(${(column.javaTypeShortName)!} ${(column.nameCamel)!}) {
        set("${(column.name)!}", ${(column.nameCamel)!});
        return (M)this;
     }

    </#list>
</#if>
}