mutation(<#list attribute as item><#if item.name!="_id">$${item.name}: ${item.typeName}<#if item_has_next>, </#if></#if></#list>){
    create${name?cap_first}(<#list attribute as item><#if item.name!="_id">${item.name}: $${item.name}<#if item_has_next>, </#if></#if></#list>){
        <#list attribute as item>
            ${item.name}
        </#list>
    }
}