query($create${name}_id: ID){
    ${name?uncap_first}s(where: {_id: $create${name}_id){
        <#list attribute as item>
            ${item.name}
        </#list>
    }
}