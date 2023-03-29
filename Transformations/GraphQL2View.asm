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
		<constant value="__exec__"/>
		<constant value="Type2Schema"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyType2Schema(NTransientLink;):V"/>
		<constant value="__matchType2Schema"/>
		<constant value="ObjectType"/>
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
		<constant value="4"/>
		<constant value="J.Attribute2Item(J):J"/>
		<constant value="CJ.including(J):CJ"/>
		<constant value="items"/>
		<constant value="12:13-12:14"/>
		<constant value="12:13-12:19"/>
		<constant value="12:5-12:19"/>
		<constant value="13:14-13:15"/>
		<constant value="13:14-13:25"/>
		<constant value="13:39-13:49"/>
		<constant value="13:65-13:66"/>
		<constant value="13:39-13:67"/>
		<constant value="13:14-13:68"/>
		<constant value="13:5-13:68"/>
		<constant value="a"/>
		<constant value="link"/>
		<constant value="Attribute2Item"/>
		<constant value="MGraphQL!Attribute;"/>
		<constant value="Item"/>
		<constant value="dataIndex"/>
		<constant value="typeName"/>
		<constant value="type"/>
		<constant value="23:13-23:14"/>
		<constant value="23:13-23:19"/>
		<constant value="23:5-23:19"/>
		<constant value="24:18-24:19"/>
		<constant value="24:18-24:24"/>
		<constant value="24:5-24:24"/>
		<constant value="25:13-25:14"/>
		<constant value="25:13-25:23"/>
		<constant value="25:5-25:23"/>
		<constant value="22:4-26:5"/>
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
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="1"/>
		</localvariabletable>
	</operation>
	<operation name="49">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="50"/>
			<call arg="51"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="52"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="0" name="17" begin="0" end="9"/>
		</localvariabletable>
	</operation>
	<operation name="53">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="54"/>
			<push arg="55"/>
			<findme/>
			<push arg="56"/>
			<call arg="57"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="58"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="50"/>
			<pcall arg="59"/>
			<dup/>
			<push arg="60"/>
			<load arg="19"/>
			<pcall arg="61"/>
			<dup/>
			<push arg="62"/>
			<push arg="63"/>
			<push arg="64"/>
			<new/>
			<pcall arg="65"/>
			<pusht/>
			<pcall arg="66"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="67" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="60" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="68">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="69"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="60"/>
			<call arg="70"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="62"/>
			<call arg="71"/>
			<store arg="72"/>
			<load arg="72"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<dup/>
			<getasm/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="29"/>
			<get arg="73"/>
			<iterate/>
			<store arg="74"/>
			<getasm/>
			<load arg="74"/>
			<call arg="75"/>
			<call arg="76"/>
			<enditerate/>
			<call arg="30"/>
			<set arg="77"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="78" begin="11" end="11"/>
			<lne id="79" begin="11" end="12"/>
			<lne id="80" begin="9" end="14"/>
			<lne id="81" begin="20" end="20"/>
			<lne id="82" begin="20" end="21"/>
			<lne id="83" begin="24" end="24"/>
			<lne id="84" begin="25" end="25"/>
			<lne id="85" begin="24" end="26"/>
			<lne id="86" begin="17" end="28"/>
			<lne id="87" begin="15" end="30"/>
			<lne id="67" begin="8" end="31"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="4" name="88" begin="23" end="27"/>
			<lve slot="3" name="62" begin="7" end="31"/>
			<lve slot="2" name="60" begin="3" end="31"/>
			<lve slot="0" name="17" begin="0" end="31"/>
			<lve slot="1" name="89" begin="0" end="31"/>
		</localvariabletable>
	</operation>
	<operation name="90">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="91"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="58"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="90"/>
			<pcall arg="59"/>
			<dup/>
			<push arg="60"/>
			<load arg="19"/>
			<pcall arg="61"/>
			<dup/>
			<push arg="62"/>
			<push arg="92"/>
			<push arg="64"/>
			<new/>
			<dup/>
			<store arg="29"/>
			<pcall arg="65"/>
			<pushf/>
			<pcall arg="66"/>
			<load arg="29"/>
			<dup/>
			<getasm/>
			<load arg="19"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<dup/>
			<getasm/>
			<load arg="19"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="93"/>
			<dup/>
			<getasm/>
			<load arg="19"/>
			<get arg="94"/>
			<call arg="30"/>
			<set arg="95"/>
			<pop/>
			<load arg="29"/>
		</code>
		<linenumbertable>
			<lne id="96" begin="25" end="25"/>
			<lne id="97" begin="25" end="26"/>
			<lne id="98" begin="23" end="28"/>
			<lne id="99" begin="31" end="31"/>
			<lne id="100" begin="31" end="32"/>
			<lne id="101" begin="29" end="34"/>
			<lne id="102" begin="37" end="37"/>
			<lne id="103" begin="37" end="38"/>
			<lne id="104" begin="35" end="40"/>
			<lne id="105" begin="22" end="41"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="62" begin="18" end="42"/>
			<lve slot="0" name="17" begin="0" end="42"/>
			<lve slot="1" name="60" begin="0" end="42"/>
		</localvariabletable>
	</operation>
</asm>
