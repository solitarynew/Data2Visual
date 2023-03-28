<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="GraphQL2View"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__applyReverseBinding"/>
		<constant value="12"/>
		<constant value="0"/>
		<constant value="J.refSetValue(SJ):J"/>
		<constant value="20"/>
		<constant value="J.__applyReverseBinding(SJ):V"/>
		<constant value="propertyName"/>
		<constant value="target"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchType2Schema():V"/>
		<constant value="A.__matchAttribute2Item():V"/>
		<constant value="__exec__"/>
		<constant value="Type2Schema"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyType2Schema(NTransientLink;):V"/>
		<constant value="Attribute2Item"/>
		<constant value="A.__applyAttribute2Item(NTransientLink;):V"/>
		<constant value="__matchType2Schema"/>
		<constant value="Type"/>
		<constant value="GraphQL"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="s"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="t"/>
		<constant value="Schema"/>
		<constant value="View"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="11:4-14:5"/>
		<constant value="__applyType2Schema"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="attribute"/>
		<constant value="items"/>
		<constant value="12:13-12:14"/>
		<constant value="12:13-12:19"/>
		<constant value="12:5-12:19"/>
		<constant value="13:14-13:15"/>
		<constant value="13:14-13:25"/>
		<constant value="13:5-13:25"/>
		<constant value="link"/>
		<constant value="__matchAttribute2Item"/>
		<constant value="Attribute"/>
		<constant value="Item"/>
		<constant value="21:4-25:5"/>
		<constant value="__applyAttribute2Item"/>
		<constant value="dataIndex"/>
		<constant value="typeName"/>
		<constant value="type"/>
		<constant value="22:13-22:14"/>
		<constant value="22:13-22:19"/>
		<constant value="22:5-22:19"/>
		<constant value="23:18-23:19"/>
		<constant value="23:18-23:24"/>
		<constant value="23:5-23:24"/>
		<constant value="24:13-24:14"/>
		<constant value="24:13-24:23"/>
		<constant value="24:5-24:23"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="4"/>
		<parameters>
			<parameter name="19" type="36"/>
			<parameter name="29" type="4"/>
		</parameters>
		<code>
			<load arg="29"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="40"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<load arg="19"/>
			<load arg="41"/>
			<pcall arg="42"/>
			<goto arg="43"/>
			<load arg="29"/>
			<iterate/>
			<load arg="41"/>
			<swap/>
			<load arg="19"/>
			<swap/>
			<pcall arg="44"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="19"/>
			<lve slot="1" name="45" begin="0" end="19"/>
			<lve slot="2" name="46" begin="0" end="19"/>
		</localvariabletable>
	</operation>
	<operation name="47">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="48"/>
			<getasm/>
			<pcall arg="49"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="3"/>
		</localvariabletable>
	</operation>
	<operation name="50">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="51"/>
			<call arg="52"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="53"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="54"/>
			<call arg="52"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="55"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="1" name="33" begin="15" end="18"/>
			<lve slot="0" name="17" begin="0" end="19"/>
		</localvariabletable>
	</operation>
	<operation name="56">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="57"/>
			<push arg="58"/>
			<findme/>
			<push arg="59"/>
			<call arg="60"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="61"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="51"/>
			<pcall arg="62"/>
			<dup/>
			<push arg="63"/>
			<load arg="19"/>
			<pcall arg="64"/>
			<dup/>
			<push arg="65"/>
			<push arg="66"/>
			<push arg="67"/>
			<new/>
			<pcall arg="68"/>
			<pusht/>
			<pcall arg="69"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="70" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="63" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="71">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="72"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="63"/>
			<call arg="73"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="65"/>
			<call arg="74"/>
			<store arg="75"/>
			<load arg="75"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="76"/>
			<call arg="30"/>
			<set arg="77"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="78" begin="11" end="11"/>
			<lne id="79" begin="11" end="12"/>
			<lne id="80" begin="9" end="14"/>
			<lne id="81" begin="17" end="17"/>
			<lne id="82" begin="17" end="18"/>
			<lne id="83" begin="15" end="20"/>
			<lne id="70" begin="8" end="21"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="65" begin="7" end="21"/>
			<lve slot="2" name="63" begin="3" end="21"/>
			<lve slot="0" name="17" begin="0" end="21"/>
			<lve slot="1" name="84" begin="0" end="21"/>
		</localvariabletable>
	</operation>
	<operation name="85">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="86"/>
			<push arg="58"/>
			<findme/>
			<push arg="59"/>
			<call arg="60"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="61"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="54"/>
			<pcall arg="62"/>
			<dup/>
			<push arg="63"/>
			<load arg="19"/>
			<pcall arg="64"/>
			<dup/>
			<push arg="65"/>
			<push arg="87"/>
			<push arg="67"/>
			<new/>
			<pcall arg="68"/>
			<pusht/>
			<pcall arg="69"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="88" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="63" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="89">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="72"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="63"/>
			<call arg="73"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="65"/>
			<call arg="74"/>
			<store arg="75"/>
			<load arg="75"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="90"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="91"/>
			<call arg="30"/>
			<set arg="92"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="93" begin="11" end="11"/>
			<lne id="94" begin="11" end="12"/>
			<lne id="95" begin="9" end="14"/>
			<lne id="96" begin="17" end="17"/>
			<lne id="97" begin="17" end="18"/>
			<lne id="98" begin="15" end="20"/>
			<lne id="99" begin="23" end="23"/>
			<lne id="100" begin="23" end="24"/>
			<lne id="101" begin="21" end="26"/>
			<lne id="88" begin="8" end="27"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="65" begin="7" end="27"/>
			<lve slot="2" name="63" begin="3" end="27"/>
			<lve slot="0" name="17" begin="0" end="27"/>
			<lve slot="1" name="84" begin="0" end="27"/>
		</localvariabletable>
	</operation>
</asm>
