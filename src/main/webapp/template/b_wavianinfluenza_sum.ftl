<html>
<head>
<META http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
.b1 {
	white-space-collapsing: preserve;
}

.t1 {width:100%;
	border-collapse: collapse;
	border-spacing: 0;
}

.r1 {
	height: 26.25pt;
}

.r2 {
	height: 16.5pt;
}

.r3 {
	height: 33.0pt;
}

.r4 {
	height: 19.5pt;
}

.r5 {
	height: 15.0pt;
}

.r6 {
	height: 22.0pt;
}

.c1 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
	border-right: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 16pt;
}

.c2 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
	border-right: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c3 {
	white-space: pre-wrap;
	text-align: center;
	color: black;
	font-size: 10pt;
}
</style>
</head>
<body class="b1">

	<table class="t1">
		<colgroup>
			<col width="15%">
			<col width="67">
			<col width="67">
			<col width="61">
			<col width="63">
			<col width="60">
			<col width="72">
			<col width="67">
			<col width="66">
			<col width="66">
			<col width="66">
			<col width="66">
			<col width="85">
			<col width="82">
			<col width="52">
			<col width="66">
			<col width="58">
			<col width="65">
			<col width="66">
			<col width="66">
			<col width="66">
			<col width="66">
			<col width="66">
			<col width="53">
			<col width="51">
			<col width="48">
			<col width="51">
			<col width="53">
			<col width="66">
			<col width="66">
			<col width="66">
			<col width="66">
			<col width="66">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="44">${templateName}</td>
			</tr>
			<tr class="r2">
				<td class="c2" rowspan="3" width="10%">省份</td>
				<td class="c2" colspan="11">高致病性禽流感灭活疫苗</td>
				<td class="c2" colspan="11">禽流感-新城疫重组二联活疫苗</td>
                <td class="c2" colspan="11">禽流感-新城疫重组二联活疫苗</td>
				<td class="c2" colspan="5" rowspan="2">应免数量(万羽)</td>
				<td class="c2" colspan="5" rowspan="2">免疫进展</td>
			</tr>
			<tr class="r3">
				<td class="c2" rowspan="2">本周疫苗使用量（万毫升）</td>
				<td class="c2" rowspan="2">累计疫苗使用数量(万毫升)</td>
				<td class="c2" colspan="4">本周免疫数量（万羽）</td>
				<td class="c2" colspan="5">累计免疫数量(万羽)</td>
				<td class="c2" rowspan="2" width="66">本周疫苗使用数量(万羽份)</td>
				<td class="c2" rowspan="2" width="66">累计疫苗使用数量(万羽份)</td>
				<td class="c2" colspan="4">本周免疫数量（万羽）</td>
				<td class="c2" colspan="5">累计免疫数量(万羽)</td>
                <td class="c2" rowspan="2" width="66">本周疫苗使用数量(万羽份)</td>
                <td class="c2" rowspan="2" width="66">累计疫苗使用数量(万羽份)</td>
                <td class="c2" colspan="4">本周免疫数量（万羽）</td>
                <td class="c2" colspan="5">累计免疫数量(万羽)</td>
			</tr>
			<tr class="r4">
				<td class="c2">鸡</td>
				<td class="c2">鸭</td>
				<td class="c2">鹅</td>
				<td class="c2">其它禽</td>
				<td class="c2">鸡</td>
				<td class="c2">鸭</td>
				<td class="c2">鹅</td>
				<td class="c2">其它禽</td>
				<td class="c3">合计</td>
                <td class="c2">鸡</td>
                <td class="c2">鸭</td>
                <td class="c2">鹅</td>
                <td class="c2">其它禽</td>
                <td class="c2">鸡</td>
                <td class="c2">鸭</td>
                <td class="c2">鹅</td>
                <td class="c2">其它禽</td>
                <td class="c3">合计</td>
				<td class="c2">鸡</td>
				<td class="c2">鸭</td>
				<td class="c2">鹅</td>
				<td class="c2">其它禽</td>
				<td class="c2">鸡</td>
				<td class="c2">鸭</td>
				<td class="c2">鹅</td>
				<td class="c2">其它禽</td>
				<td class="c2">合计</td>
				<td class="c2">鸡</td>
				<td class="c2">鸭</td>
				<td class="c2">鹅</td>
				<td class="c2">其它禽</td>
				<td class="c2">合计</td>
				<td class="c2">鸡</td>
				<td class="c2">鸭</td>
				<td class="c2">鹅</td>
				<td class="c2">其它禽</td>
				<td class="c2">合计</td>
			</tr>
			<#assign aiInactivatedvaccineSum=0>
			<#assign aiInactivatedvaccine_ljSum=0>
			<#assign aiInactivatedimmuneamountchickenSum=0>
			<#assign aiInactivatedimmuneamountchicken_ljSum=0>
			<#assign aiInactivatedimmuneamountduckSum=0>
			<#assign aiInactivatedimmuneamountduck_ljSum=0>
			<#assign aiInactivatedimmuneamountgooseSum=0>
			<#assign aiInactivatedimmuneamountgoose_ljSum=0>
			<#assign aiInactivatedimmuneamountotherSum=0>
			<#assign aiInactivatedimmuneamountother_ljSum=0>
			<#assign aiJointvaccineSum=0>
			<#assign aiJointvaccine_ljSum=0>
			<#assign aiJointimmuneamountchickenSum=0>
			<#assign aiJointimmuneamountchicken_ljSum=0>
			<#assign aiJointimmuneamountduckSum=0>
			<#assign aiJointimmuneamountduck_ljSum=0>
			<#assign aiJointimmuneamountgooseSum=0>
			<#assign aiJointimmuneamountgoose_ljSum=0>
			<#assign aiJointimmuneamountotherSum=0>
			<#assign aiJointimmuneamountother_ljSum=0>


			<#assign aiH5H7VaccineSum=0>
			<#assign aiH5H7Vaccine_ljSum=0>
			<#assign aiH5H7ImmuneAmountChickenSum=0>
			<#assign aiH5H7ImmuneAmountChicken_ljSum=0>
			<#assign aiH5H7ImmuneAmountDuckSum=0>
			<#assign aiH5H7ImmuneAmountDuck_ljSum=0>
			<#assign aiH5H7ImmuneAmountGooseSum=0>
			<#assign aiH5H7ImmuneAmountGoose_ljSum=0>
			<#assign aiH5H7ImmuneAmountOtherSum=0>
			<#assign aiH5H7ImmuneAmountOther_ljSum=0>

			<#assign immunebirdfluchecken_ljSum=0>
			<#assign immunebirdfluduck_ljSum=0>
			<#assign immunebirdflugoose_ljSum=0>
			<#assign immunebirdfluother_ljSum=0>
			<#assign immunebirdflu_ljSum=0>
			<#list items as item>
				<#assign aiInactivatedvaccineSum=aiInactivatedvaccineSum?default(0) +item.aiInactivatedvaccine?default(0)>
				<#assign aiInactivatedvaccine_ljSum=aiInactivatedvaccine_ljSum?default(0) +cumulatives[item_index].aiInactivatedvaccine?default(0)>
				<#assign aiInactivatedimmuneamountchickenSum=aiInactivatedimmuneamountchickenSum?default(0) +item.aiInactivatedimmuneamountchicken?default(0)>
				<#assign aiInactivatedimmuneamountchicken_ljSum=aiInactivatedimmuneamountchicken_ljSum?default(0) +cumulatives[item_index].aiInactivatedimmuneamountchicken?default(0)>
				<#assign aiInactivatedimmuneamountduckSum=aiInactivatedimmuneamountduckSum?default(0) +item.aiInactivatedimmuneamountduck?default(0)>
				<#assign aiInactivatedimmuneamountduck_ljSum=aiInactivatedimmuneamountduck_ljSum?default(0) +cumulatives[item_index].aiInactivatedimmuneamountduck?default(0)>
				<#assign aiInactivatedimmuneamountgooseSum=aiInactivatedimmuneamountgooseSum?default(0) +item.aiInactivatedimmuneamountgoose?default(0)>
				<#assign aiInactivatedimmuneamountgoose_ljSum=aiInactivatedimmuneamountgoose_ljSum?default(0) +cumulatives[item_index].aiInactivatedimmuneamountgoose?default(0)>
				<#assign aiInactivatedimmuneamountotherSum=aiInactivatedimmuneamountotherSum?default(0) +item.aiInactivatedimmuneamountother?default(0)>
				<#assign aiInactivatedimmuneamountother_ljSum=aiInactivatedimmuneamountother_ljSum?default(0) +cumulatives[item_index].aiInactivatedimmuneamountother?default(0)>

				<#assign aiInactivatedimmuneamount_ljSum=aiInactivatedimmuneamountchicken_ljSum?default(0) +aiInactivatedimmuneamountduck_ljSum?default(0)+aiInactivatedimmuneamountgoose_ljSum?default(0) +aiInactivatedimmuneamountother_ljSum?default(0)>

				<#assign aiJointvaccineSum=aiJointvaccineSum?default(0) +item.aiJointvaccine?default(0)>
				<#assign aiJointvaccine_ljSum=aiJointvaccine_ljSum?default(0) +cumulatives[item_index].aiJointvaccine?default(0)>
				<#assign aiJointimmuneamountchickenSum=aiJointimmuneamountchickenSum?default(0) +item.aiJointimmuneamountchicken?default(0)>
				<#assign aiJointimmuneamountchicken_ljSum=aiJointimmuneamountchicken_ljSum?default(0) +cumulatives[item_index].aiJointimmuneamountchicken?default(0)>
				<#assign aiJointimmuneamountduckSum=aiJointimmuneamountduckSum?default(0) +item.aiJointimmuneamountduck?default(0)>
				<#assign aiJointimmuneamountduck_ljSum=aiJointimmuneamountduck_ljSum?default(0) +cumulatives[item_index].aiJointimmuneamountduck?default(0)>

				<#assign aiJointimmuneamountgooseSum=aiJointimmuneamountgooseSum?default(0) +item.aiJointimmuneamountgoose?default(0)>
				<#assign aiJointimmuneamountgoose_ljSum=aiJointimmuneamountgoose_ljSum?default(0) +cumulatives[item_index].aiJointimmuneamountgoose?default(0)>
				<#assign aiJointimmuneamountotherSum=aiJointimmuneamountotherSum?default(0) +item.aiJointimmuneamountother?default(0)>
				<#assign aiJointimmuneamountother_ljSum=aiJointimmuneamountother_ljSum?default(0) +cumulatives[item_index].aiJointimmuneamountother?default(0)>
				<#assign aiJointimmuneamount_ljSum=aiJointimmuneamountchicken_ljSum?default(0) +aiJointimmuneamountduck_ljSum?default(0)+aiJointimmuneamountgoose_ljSum?default(0) +aiJointimmuneamountother_ljSum?default(0)>

				<#assign aiH5H7VaccineSum=aiH5H7VaccineSum?default(0) +item.aiH5H7Vaccine?default(0)>
				<#assign aiH5H7Vaccine_ljSum=aiH5H7Vaccine_ljSum?default(0) +cumulatives[item_index].aiH5H7Vaccine?default(0)>
				<#assign aiH5H7ImmuneAmountChickenSum=aiH5H7ImmuneAmountChickenSum?default(0) +item.aiH5H7ImmuneAmountChicken?default(0)>
				<#assign aiH5H7ImmuneAmountChicken_ljSum=aiH5H7ImmuneAmountChicken_ljSum?default(0) +cumulatives[item_index].aiH5H7ImmuneAmountChicken?default(0)>
				<#assign aiH5H7ImmuneAmountDuckSum=aiH5H7ImmuneAmountDuckSum?default(0) +item.aiH5H7ImmuneAmountDuck?default(0)>
				<#assign aiH5H7ImmuneAmountDuck_ljSum=aiH5H7ImmuneAmountDuck_ljSum?default(0) +cumulatives[item_index].aiH5H7ImmuneAmountDuck?default(0)>
				<#assign aiH5H7ImmuneAmountGooseSum=aiH5H7ImmuneAmountGooseSum?default(0) +item.aiH5H7ImmuneAmountGoose?default(0)>
				<#assign aiH5H7ImmuneAmountGoose_ljSum=aiH5H7ImmuneAmountGoose_ljSum?default(0) +cumulatives[item_index].aiH5H7ImmuneAmountGoose?default(0)>
				<#assign aiH5H7ImmuneAmountOtherSum=aiH5H7ImmuneAmountOtherSum?default(0) +item.aiH5H7ImmuneAmountOther?default(0)>
				<#assign aiH5H7ImmuneAmountOther_ljSum=aiH5H7ImmuneAmountOther_ljSum?default(0) +cumulatives[item_index].aiH5H7ImmuneAmountOther?default(0)>

				<#assign aiH5H7ImmuneAmount_ljSum=aiH5H7ImmuneAmountChicken_ljSum?default(0) +aiInactivatedimmuneamountduck_ljSum?default(0)+aiH5H7ImmuneAmountGoose_ljSum?default(0) +aiH5H7ImmuneAmountOther_ljSum?default(0)>


				<#assign immunebirdfluchecken_ljSum=immunebirdfluchecken_ljSum?default(0) +wlivestockinouts[item_index].immunebirdfluchecken?default(0)>
				<#assign immunebirdfluduck_ljSum=immunebirdfluduck_ljSum?default(0) +wlivestockinouts[item_index].immunebirdfluduck?default(0)>
				<#assign immunebirdflugoose_ljSum=immunebirdflugoose_ljSum?default(0) +wlivestockinouts[item_index].immunebirdflugoose?default(0)>
				<#assign immunebirdfluother_ljSum=immunebirdfluother_ljSum?default(0) +wlivestockinouts[item_index].immunebirdfluother?default(0)>
				<#assign immunebirdflu_ljSum=immunebirdfluchecken_ljSum?default(0) +immunebirdfluduck_ljSum?default(0)+immunebirdflugoose_ljSum?default(0) +immunebirdfluother_ljSum?default(0)>
			<tr class="r5">
				<td n="airegionname" class="c2"><#if item.aiRegionname??>${item.aiRegionname}</#if></td>
			
				<td n="aiInactivatedvaccine"  class="c2"><#if item.aiInactivatedvaccine??>${item.aiInactivatedvaccine}</#if></td>
				<td n=""  class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].aiInactivatedvaccine??>${cumulatives[item_index].aiInactivatedvaccine}</#if></td>
				
				<td n="aiInactivatedimmuneamountchicken"  class="c2"><#if item.aiInactivatedimmuneamountchicken??>${item.aiInactivatedimmuneamountchicken}</#if></td>
				<td n="aiInactivatedimmuneamountduck"  class="c2"><#if item.aiInactivatedimmuneamountduck??>${item.aiInactivatedimmuneamountduck}</#if></td>
				<td n="aiInactivatedimmuneamountgoose"  class="c2"><#if item.aiInactivatedimmuneamountgoose??>${item.aiInactivatedimmuneamountgoose}</#if></td>
				<td n="aiInactivatedimmuneamountother"  class="c2"><#if item.aiInactivatedimmuneamountother??>${item.aiInactivatedimmuneamountother}</#if></td>
				
				<td n=""  class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].aiInactivatedimmuneamountchicken??>${cumulatives[item_index].aiInactivatedimmuneamountchicken}</#if></td>
				<td n=""  class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].aiInactivatedimmuneamountduck??>${cumulatives[item_index].aiInactivatedimmuneamountduck}</#if></td>
				<td n=""  class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].aiInactivatedimmuneamountgoose??>${cumulatives[item_index].aiInactivatedimmuneamountgoose}</#if></td>
				<td n=""  class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].aiInactivatedimmuneamountother??>${cumulatives[item_index].aiInactivatedimmuneamountother}</#if></td>
				<td n=""  class="c2"><#if cumulatives[item_index]??>${cumulatives[item_index].aiInactivatedimmuneamountchicken?default(0)+cumulatives[item_index].aiInactivatedimmuneamountduck?default(0)+cumulatives[item_index].aiInactivatedimmuneamountgoose?default(0)+cumulatives[item_index].aiInactivatedimmuneamountother?default(0)}</#if></td>
				
				<td n="aiJointvaccine"  class="c2"><#if item.aiJointvaccine??>${item.aiJointvaccine}</#if></td>
				<td n=""  class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].aiJointvaccine??>${cumulatives[item_index].aiJointvaccine}</#if></td>
			
				<td n="aiJointimmuneamountchicken"  class="c2"><#if item.aiJointimmuneamountchicken??>${item.aiJointimmuneamountchicken}</#if></td>
				<td n="aiJointimmuneamountduck"  class="c2"><#if item.aiJointimmuneamountduck??>${item.aiJointimmuneamountduck}</#if></td>
				<td n="aiJointimmuneamountgoose"  class="c2"><#if item.aiJointimmuneamountgoose??>${item.aiJointimmuneamountgoose}</#if></td>
				<td n="aiJointimmuneamountother"  class="c2"><#if item.aiJointimmuneamountother??>${item.aiJointimmuneamountother}</#if></td>
				
				<td n=""  class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].aiJointimmuneamountchicken??>${cumulatives[item_index].aiJointimmuneamountchicken}</#if></td>
				<td n=""  class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].aiJointimmuneamountduck??>${cumulatives[item_index].aiJointimmuneamountduck}</#if></td>
				<td n=""  class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].aiJointimmuneamountgoose??>${cumulatives[item_index].aiJointimmuneamountgoose}</#if></td>
				<td n=""  class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].aiJointimmuneamountother??>${cumulatives[item_index].aiJointimmuneamountother}</#if></td>
				<td n=""  class="c2"><#if cumulatives[item_index]??>${cumulatives[item_index].aiJointimmuneamountchicken?default(0)+cumulatives[item_index].aiJointimmuneamountduck?default(0)+cumulatives[item_index].aiJointimmuneamountgoose?default(0)+cumulatives[item_index].aiJointimmuneamountother?default(0)}</#if></td>

                <td n="aiH5H7Vaccine"  class="c2"><#if item.aiH5H7Vaccine??>${item.aiH5H7Vaccine}</#if>123</td>
                <td n=""  class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].aiH5H7Vaccine??>${cumulatives[item_index].aiH5H7Vaccine}</#if>456</td>

                <td n="aiH5H7ImmuneAmountChicken"  class="c2"><#if item.aiH5H7ImmuneAmountChicken??>${item.aiH5H7ImmuneAmountChicken}</#if></td>
                <td n="aiH5H7ImmuneAmountDuck"  class="c2"><#if item.aiH5H7ImmuneAmountDuck??>${item.aiH5H7ImmuneAmountDuck}</#if></td>
                <td n="aiH5H7ImmuneAmountGoose"  class="c2"><#if item.aiH5H7ImmuneAmountGoose??>${item.aiH5H7ImmuneAmountGoose}</#if></td>
                <td n="aiH5H7ImmuneAmountOther"  class="c2"><#if item.aiH5H7ImmuneAmountOther??>${item.aiH5H7ImmuneAmountOther}</#if></td>

                <td n=""  class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].aiH5H7ImmuneAmountChicken??>${cumulatives[item_index].aiH5H7ImmuneAmountChicken}</#if></td>
                <td n=""  class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].aiH5H7ImmuneAmountDuck??>${cumulatives[item_index].aiH5H7ImmuneAmountDuck}</#if></td>
                <td n=""  class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].aiH5H7ImmuneAmountGoose??>${cumulatives[item_index].aiH5H7ImmuneAmountGoose}</#if></td>
                <td n=""  class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].aiH5H7ImmuneAmountOther??>${cumulatives[item_index].aiH5H7ImmuneAmountOther}</#if></td>
                <td n=""  class="c2"><#if cumulatives[item_index]??>${cumulatives[item_index].aiH5H7ImmuneAmountChicken?default(0)+cumulatives[item_index].aiH5H7ImmuneAmountDuck?default(0)+cumulatives[item_index].aiH5H7ImmuneAmountGoose?default(0)+cumulatives[item_index].aiH5H7ImmuneAmountOther?default(0)}</#if></td>


                <td class="c2"><#if wlivestockinouts[item_index]??&&wlivestockinouts[item_index].immunebirdfluchecken??>${wlivestockinouts[item_index].immunebirdfluchecken}</#if></td>
				<td class="c2"><#if wlivestockinouts[item_index]??&&wlivestockinouts[item_index].immunebirdfluduck??>${wlivestockinouts[item_index].immunebirdfluduck}</#if></td>
				<td class="c2"><#if wlivestockinouts[item_index]??&&wlivestockinouts[item_index].immunebirdflugoose??>${wlivestockinouts[item_index].immunebirdflugoose}</#if></td>
				<td class="c2"><#if wlivestockinouts[item_index]??&&wlivestockinouts[item_index].immunebirdfluother??>${wlivestockinouts[item_index].immunebirdfluother}</#if></td>
				<td class="c2"><#if wlivestockinouts[item_index]??>${wlivestockinouts[item_index].immunebirdfluchecken?default(0)+wlivestockinouts[item_index].immunebirdfluduck?default(0)+wlivestockinouts[item_index].immunebirdflugoose?default(0)+wlivestockinouts[item_index].immunebirdfluother?default(0)}</#if></td>
				
				<td class="c2">
					<#if  wlivestockinouts[item_index]??&&wlivestockinouts[item_index].immunebirdfluchecken??&& (wlivestockinouts[item_index].immunebirdfluchecken>0)>
				<#if wlivestockinouts[item_index]??&&cumulatives[item_index]??>
				${(cumulatives[item_index].aiInactivatedimmuneamountchicken?default(0)+cumulatives[item_index].aiJointimmuneamountchicken?default(0)+cumulatives[item_index].aiH5H7ImmuneAmountChicken?default(0))*100/wlivestockinouts[item_index].immunebirdfluchecken}%</#if></#if>
				</td>
				<td class="c2">
					<#if  (wlivestockinouts[item_index]??&&wlivestockinouts[item_index].immunebirdfluduck??&& wlivestockinouts[item_index].immunebirdfluduck>0)>
				<#if wlivestockinouts[item_index]??&&cumulatives[item_index]??>
				${(cumulatives[item_index].aiInactivatedimmuneamountduck?default(0)+cumulatives[item_index].aiJointimmuneamountduck?default(0)+cumulatives[item_index].aiH5H7ImmuneAmountDuck?default(0))*100/wlivestockinouts[item_index].immunebirdfluduck}%</#if></#if>
				</td>
				<td class="c2">
					<#if  (wlivestockinouts[item_index]??&&wlivestockinouts[item_index].immunebirdflugoose??&& wlivestockinouts[item_index].immunebirdflugoose>0)>
				<#if wlivestockinouts[item_index]??&&cumulatives[item_index]??>
				${(cumulatives[item_index].aiInactivatedimmuneamountgoose?default(0)+cumulatives[item_index].aiJointimmuneamountgoose?default(0)+cumulatives[item_index].aiH5H7ImmuneAmountGoose?default(0))*100/wlivestockinouts[item_index].immunebirdflugoose}%</#if></#if>
				</td>
				<td class="c2">
					<#if  (wlivestockinouts[item_index]??&&wlivestockinouts[item_index].immunebirdfluother??&& wlivestockinouts[item_index].immunebirdfluother>0)>
				<#if wlivestockinouts[item_index]??&&cumulatives[item_index]??>
				${(cumulatives[item_index].aiInactivatedimmuneamountother?default(0)+cumulatives[item_index].aiJointimmuneamountother?default(0)+cumulatives[item_index].aiH5H7ImmuneAmountOther?default(0))*100/wlivestockinouts[item_index].immunebirdfluother}%</#if></#if>
				</td>
				<td n=""  class="c2">

				<#if (wlivestockinouts[item_index]??&&(wlivestockinouts[item_index].immunebirdfluchecken?default(0)+wlivestockinouts[item_index].immunebirdfluduck?default(0)+wlivestockinouts[item_index].immunebirdflugoose?default(0)+wlivestockinouts[item_index].immunebirdfluother?default(0))>0)>
				${(cumulatives[item_index].aiInactivatedimmuneamountchicken?default(0)+cumulatives[item_index].aiInactivatedimmuneamountduck?default(0)+cumulatives[item_index].aiInactivatedimmuneamountgoose?default(0)+cumulatives[item_index].aiInactivatedimmuneamountother?default(0)
				+cumulatives[item_index].aiJointimmuneamountchicken?default(0)+cumulatives[item_index].aiJointimmuneamountduck?default(0)+cumulatives[item_index].aiJointimmuneamountgoose?default(0)+cumulatives[item_index].aiJointimmuneamountother?default(0)
				+cumulatives[item_index].aiH5H7ImmuneAmountChicken?default(0)+cumulatives[item_index].aiH5H7ImmuneAmountDuck?default(0)+cumulatives[item_index].aiH5H7ImmuneAmountGoose?default(0)+cumulatives[item_index].aiH5H7ImmuneAmountOther?default(0)
				)*100/(wlivestockinouts[item_index].immunebirdfluchecken+wlivestockinouts[item_index].immunebirdfluduck+wlivestockinouts[item_index].immunebirdflugoose+wlivestockinouts[item_index].immunebirdfluother)}%</#if>
				</td>
			</tr>
			</#list>
            <tr class="r5">
                <td  class="c2">合计</td>
                <td n="aiInactivatedvaccineSum" class="c2"><#if aiInactivatedvaccineSum??>${aiInactivatedvaccineSum}</#if></td>
                <td n="aiInactivatedvaccine_ljSum" class="c2"><#if aiInactivatedvaccine_ljSum??>${aiInactivatedvaccine_ljSum}</#if></td>

                <td n="aiInactivatedimmuneamountchickenSum" class="c2"><#if aiInactivatedimmuneamountchickenSum??>${aiInactivatedimmuneamountchickenSum}</#if></td>
                <td n="aiInactivatedimmuneamountduckSum" class="c2"><#if aiInactivatedimmuneamountduckSum??>${aiInactivatedimmuneamountduckSum}</#if></td>
                <td n="aiInactivatedimmuneamountgooseSum" class="c2"><#if aiInactivatedimmuneamountgooseSum??>${aiInactivatedimmuneamountgooseSum}</#if></td>
                <td n="aiInactivatedimmuneamountotherSum" class="c2"><#if aiInactivatedimmuneamountotherSum??>${aiInactivatedimmuneamountotherSum}</#if></td>

                <td n="aiInactivatedimmuneamountchicken_ljSum" class="c2"><#if aiInactivatedimmuneamountchicken_ljSum??>${aiInactivatedimmuneamountchicken_ljSum}</#if></td>
                <td n="aiInactivatedimmuneamountduck_ljSum" class="c2"><#if aiInactivatedimmuneamountduck_ljSum??>${aiInactivatedimmuneamountduck_ljSum}</#if></td>
                <td n="aiInactivatedimmuneamountgoose_ljSum" class="c2"><#if aiInactivatedimmuneamountgoose_ljSum??>${aiInactivatedimmuneamountgoose_ljSum}</#if></td>
                <td n="aiInactivatedimmuneamountother_ljSum" class="c2"><#if aiInactivatedimmuneamountother_ljSum??>${aiInactivatedimmuneamountother_ljSum}</#if></td>

                <td  class="c2">${aiInactivatedimmuneamount_ljSum}</td>

                <td n="aiJointvaccineSum" class="c2"><#if aiJointvaccineSum??>${aiJointvaccineSum}</#if></td>
                <td n="aiJointvaccine_ljSum" class="c2"><#if aiJointvaccine_ljSum??>${aiJointvaccine_ljSum}</#if></td>

                <td n="aiJointimmuneamountchickenSum" class="c2"><#if aiJointimmuneamountchickenSum??>${aiJointimmuneamountchickenSum}</#if></td>
                <td n="aiJointimmuneamountduckSum" class="c2"><#if aiJointimmuneamountduckSum??>${aiJointimmuneamountduckSum}</#if></td>
                <td n="aiJointimmuneamountgooseSum" class="c2"><#if aiJointimmuneamountgooseSum??>${aiJointimmuneamountgooseSum}</#if></td>
                <td n="aiJointimmuneamountotherSum" class="c2"><#if aiJointimmuneamountotherSum??>${aiJointimmuneamountotherSum}</#if></td>

                <td n="aiJointimmuneamountchicken_ljSum" class="c2"><#if aiJointimmuneamountchicken_ljSum??>${aiJointimmuneamountchicken_ljSum}</#if></td>
                <td n="aiJointimmuneamountduck_ljSum" class="c2"><#if aiJointimmuneamountduck_ljSum??>${aiJointimmuneamountduck_ljSum}</#if></td>
                <td n="aiJointimmuneamountgoose_ljSum" class="c2"><#if aiJointimmuneamountgoose_ljSum??>${aiJointimmuneamountgoose_ljSum}</#if></td>
                <td n="aiJointimmuneamountother_ljSum" class="c2"><#if aiJointimmuneamountother_ljSum??>${aiJointimmuneamountother_ljSum}</#if></td>

                <td  class="c2">${aiJointimmuneamount_ljSum}</td>

                <td n="aiH5H7VaccineSum" class="c2"><#if aiH5H7VaccineSum??>${aiH5H7VaccineSum}</#if></td>
                <td n="aiH5H7Vaccine_ljSum" class="c2"><#if aiH5H7Vaccine_ljSum??>${aiH5H7Vaccine_ljSum}</#if></td>

                <td n="aiH5H7ImmuneAmountChickenSum" class="c2"><#if aiH5H7ImmuneAmountChickenSum??>${aiH5H7ImmuneAmountChickenSum}</#if></td>
                <td n="aiH5H7ImmuneAmountDuckSum" class="c2"><#if aiH5H7ImmuneAmountDuckSum??>${aiH5H7ImmuneAmountDuckSum}</#if></td>
                <td n="aiH5H7ImmuneAmountGooseSum" class="c2"><#if aiH5H7ImmuneAmountGooseSum??>${aiH5H7ImmuneAmountGooseSum}</#if></td>
                <td n="aiH5H7ImmuneAmountOtherSum" class="c2"><#if aiH5H7ImmuneAmountOtherSum??>${aiH5H7ImmuneAmountOtherSum}</#if></td>

                <td n="aiH5H7ImmuneAmountChicken_ljSum" class="c2"><#if aiH5H7ImmuneAmountChicken_ljSum??>${aiH5H7ImmuneAmountChicken_ljSum}</#if></td>
                <td n="aiH5H7ImmuneAmountDuck_ljSum" class="c2"><#if aiH5H7ImmuneAmountDuck_ljSum??>${aiH5H7ImmuneAmountDuck_ljSum}</#if></td>
                <td n="aiH5H7ImmuneAmountGoose_ljSum" class="c2"><#if aiH5H7ImmuneAmountGoose_ljSum??>${aiH5H7ImmuneAmountGoose_ljSum}</#if></td>
                <td n="aiH5H7ImmuneAmountOther_ljSum" class="c2"><#if aiH5H7ImmuneAmountOther_ljSum??>${aiH5H7ImmuneAmountOther_ljSum}</#if></td>

                <td  class="c2">${aiH5H7ImmuneAmount_ljSum}</td>

                <td n="immunebirdfluchecken_ljSum" class="c2"><#if immunebirdfluchecken_ljSum??>${immunebirdfluchecken_ljSum}</#if></td>
                <td n="immunebirdfluduck_ljSum" class="c2"><#if immunebirdfluduck_ljSum??>${immunebirdfluduck_ljSum}</#if></td>
                <td n="immunebirdflugoose_ljSum" class="c2"><#if immunebirdflugoose_ljSum??>${immunebirdflugoose_ljSum}</#if></td>
                <td n="immunebirdfluother_ljSum" class="c2"><#if immunebirdfluother_ljSum??>${immunebirdfluother_ljSum}</#if></td>
                <td n="immunebirdflu_ljSum" class="c2"><#if immunebirdflu_ljSum??>${immunebirdflu_ljSum}</#if></td>

                <td  class="c2"><#if (immunebirdfluchecken_ljSum>0)>${(aiInactivatedimmuneamountchicken_ljSum?default(0)+aiJointimmuneamountchicken_ljSum?default(0)+aiH5H7ImmuneAmountChicken_ljSum?default(0))*100/immunebirdfluchecken_ljSum}%</#if></td>
				<td  class="c2"><#if (immunebirdfluduck_ljSum>0)>${(aiInactivatedimmuneamountduck_ljSum?default(0)+aiJointimmuneamountduck_ljSum?default(0)+aiH5H7ImmuneAmountDuck_ljSum?default(0))*100/immunebirdfluduck_ljSum}%</#if></td>
				<td  class="c2"><#if (immunebirdflugoose_ljSum>0)>${(aiInactivatedimmuneamountgoose_ljSum?default(0)+aiJointimmuneamountgoose_ljSum?default(0)+aiH5H7ImmuneAmountGoose_ljSum?default(0))*100/immunebirdflugoose_ljSum}%</#if></td>
				<td  class="c2"><#if (immunebirdfluother_ljSum>0)>${(aiInactivatedimmuneamountother_ljSum?default(0)+aiJointimmuneamountother_ljSum?default(0)+aiH5H7ImmuneAmountOther_ljSum?default(0))*100/immunebirdfluother_ljSum}%</#if></td>
				<td  class="c2"><#if (immunebirdflu_ljSum>0)>${(aiInactivatedimmuneamount_ljSum?default(0)+aiJointimmuneamount_ljSum?default(0)+aiH5H7ImmuneAmount_ljSum?default(0))*100/immunebirdflu_ljSum}%</#if></td>

            </tr>
		</tbody>
	</table>
</body>
</html>
