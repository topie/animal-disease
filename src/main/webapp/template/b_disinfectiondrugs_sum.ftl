<style type="text/css">

    .t1 {
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
        <td class="c1" colspan="7">消毒药品储备统计季度报表</td>
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
    <#list items as item>
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
    </tbody>
</table>

