<style type="text/css">

    .t1 {width:100%;
        border-collapse: collapse;
        border-spacing: 0;
        width: 99%;
    }

    .r1 {
        height: 19.0pt;
    }

    .r2 {
        height: 15.0pt;
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
</style>
<table class="t1">
    <colgroup>
        <col width="70">
        <col width="70">
        <col width="70">
        <col width="70">
        <col width="70">
        <col width="70">
        <col width="70">
    </colgroup>
    <tbody>
    <tr class="r1">
        <td class="c1" colspan="7">${templateName}-汇总</td>
    </tr>
    <tr class="r2">
        <td class="c2" rowspan="2">省份</td>
        <td class="c2" colspan="3">省级消毒物品储备统计</td>
        <td class="c2" colspan="3">全省消毒物品储备统计</td>
    </tr>
    <tr class="r2">
        <td class="c2">消毒药（吨）</td>
        <td class="c2">消毒剂（升）</td>
        <td class="c2">其它（吨）</td>
        <td class="c2">消毒药（吨）</td>
        <td class="c2">消毒剂（升）</td>
        <td class="c2">其它（吨）</td>
    </tr>
    <#assign dfDrugsSum=0>
    <#assign dfPharmacySum=0>
    <#assign dfOtherSum=0>
    <#assign dfAlldrugsSum=0>
    <#assign dfAllpharmacySum=0>
    <#assign dfAllotherSum=0>
    <#list items as item>
        <#assign dfDrugsSum=dfDrugsSum?default(0) +item.dfDrugs?default(0)>
        <#assign dfPharmacySum=dfPharmacySum?default(0) +item.dfPharmacy?default(0)>
        <#assign dfOtherSum=dfOtherSum?default(0) +item.dfOther?default(0)>
        <#assign dfAlldrugsSum=dfAlldrugsSum?default(0) +item.dfAlldrugs?default(0)>
        <#assign dfAllpharmacySum=dfAllpharmacySum?default(0) +item.dfAllpharmacy?default(0)>
        <#assign dfAllotherSum=dfAllotherSum?default(0) +item.dfAllother?default(0)>
    <tr class="r2">
        <td class="c2">${item.dfRegionname}</td>
        <td class="c2">${item.dfDrugs}</td>
        <td class="c2">${item.dfPharmacy}</td>
        <td class="c2">${item.dfOther}</td>
        <td class="c2">${item.dfAlldrugs}</td>
        <td class="c2">${item.dfAllpharmacy}</td>
        <td class="c2">${item.dfAllother}</td>
    </tr>
    </#list>
    <tr class="r2">
        <td  class="c2">合计</td>
        <td n="dfDrugsSum" class="c2"><#if dfDrugsSum??>${dfDrugsSum}</#if></td>
        <td n="dfPharmacySum" class="c2"><#if dfPharmacySum??>${dfPharmacySum}</#if></td>
        <td n="dfOtherSum" class="c2"><#if dfOtherSum??>${dfOtherSum}</#if></td>
        <td n="dfAlldrugsSum" class="c2"><#if dfAlldrugsSum??>${dfAlldrugsSum}</#if></td>
        <td n="dfAllpharmacySum" class="c2"><#if dfAllpharmacySum??>${dfAllpharmacySum}</#if></td>
        <td n="dfAllotherSum" class="c2"><#if dfAllotherSum??>${dfAllotherSum}</#if></td>

    </tr>
    </tbody>
</table>

