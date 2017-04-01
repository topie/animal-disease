<style type="text/css">

    .t1 {
        border-collapse: collapse;
        border-spacing: 0;
    }

    .r5 {
        height: 19.0pt;
    }

    .r6 {
        height: 56.0pt;
    }

    .r7 {
        height: 14.0pt;
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

    .c6 {
        white-space: pre-wrap;
        text-align: center;
        border-top: thin solid black;
        border-bottom: thin solid black;
        border-left: thin solid black;
        color: black;
        font-size: 10pt;
    }

    .c9 {
        white-space: pre-wrap;
        border-top: thin solid black;
        border-right: thin solid black;
        border-bottom: thin solid black;
        border-left: thin solid black;
        font-size: 10pt;
    }

    .c10 {
        white-space: pre-wrap;
        text-align: center;
        color: black;
        font-size: 10pt;
    }

    .c11 {
        white-space: pre-wrap;
        text-align: center;
        border-top: thin solid black;
        border-right: thin solid black;
        border-bottom: thin solid black;
        border-left: thin solid black;
        font-size: 10pt;
    }
</style>

<table class="t1">
    <colgroup>
        <col width="200">
        <col width="70">
        <col width="70">
        <col width="70">
        <col width="70">
        <col width="70">
        <col width="70">
        <col width="70">
        <col width="70">
        <col width="70">
        <col width="70">
        <col width="70">
        <col width="70">
        <col width="70">
        <col width="70">
        <col width="70">
        <col width="70">
        <col width="70">
        <col width="70">
        <col width="70">
        <col width="70">
        <col width="70">
    </colgroup>
    <tbody>
    <tr class="r5">
        <td class="c1" colspan="22">${templateName}</td>
    </tr>
    <tr class="r6">
        <td class="c2" rowspan="2">省份</td>
        <td class="c2" colspan="8">期间存栏数量（万头/只/羽）</td>
        <td class="c2" colspan="4">期间牲畜口蹄疫应免数量（万头/只）</td>
        <td class="c10" colspan="4">期间禽流感应免数量（万羽）</td>
        <td class="c2" colspan="2">期间A型口蹄疫应免数量（万头）</td>
        <td class="c2">期间高致病性猪蓝耳病应免数量（万头）</td>
        <td class="c2">期间猪瘟应免数量（万头）</td>
        <td class="c2">期间新城疫应免数量（万羽）</td>
    </tr>
    <tr class="r7">
        <td class="c2">猪</td>
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <td class="c2">其它动物</td>
        <td class="c2">鸡</td>
        <td class="c2">鸭</td>
        <td class="c2">鹅</td>
        <td class="c2">其它禽</td>
        <td class="c2">猪</td>
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <td class="c2">其它动物</td>
        <td class="c2">鸡</td>
        <td class="c2">鸭</td>
        <td class="c2">鹅</td>
        <td class="c2">其它禽</td>
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <td class="c2">猪</td>
        <td class="c2">猪</td>
        <td class="c2">鸡</td>
    </tr>
    <#list items as item>
    <tr class="r7">
        <td class="c9">${item.livRegionname}</td>
        <td role="data" n="herdspig" class="c2">${item.herdspig}</td>
        <td role="data" n="herdsniu" class="c2">${item.herdsniu}</td>
        <td role="data" n="herdssheep" class="c2">${item.herdssheep}</td>
        <td role="data" n="herdsother" class="c2">${item.herdsother}</td>
        <td role="data" n="herdschicken" class="c2">${item.herdschicken}</td>
        <td role="data" n="herdsduck" class="c2">${item.herdsduck}</td>
        <td role="data" n="herdsgoose" class="c2">${item.herdsgoose}</td>
        <td role="data" n="herdsotherq" class="c2">${item.herdsotherq}</td>
        <td role="data" n="immunefmdpig" class="c2">${item.immunefmdpig}</td>
        <td role="data" n="immunefmdniu" class="c2">${item.immunefmdniu}</td>
        <td role="data" n="immunefmdsheep" class="c6">${item.immunefmdsheep}</td>
        <td role="data" n="immunefmdother" class="c2">${item.immunefmdother}</td>
        <td role="data" n="immunebirdfluchecken" class="c2">${item.immunebirdfluchecken}</td>
        <td role="data" n="immunebirdfluduck" class="c2">${item.immunebirdfluduck}</td>
        <td role="data" n="immunebirdflugoose" class="c2">${item.immunebirdflugoose}</td>
        <td role="data" n="immunebirdfluother" class="c2">${item.immunebirdfluother}</td>
        <td role="data" n="immuneafmdniu" class="c2">${item.immuneafmdniu}</td>
        <td role="data" n="immuneafmdsheep" class="c2">${item.immuneafmdsheep}</td>
        <td role="data" n="immuneblueear" class="c2">${item.immuneblueear}</td>
        <td role="data" n="immuneswine" class="c2">${item.immuneswine}</td>
        <td role="data" n="immunenewcastle" class="c2">${item.immunenewcastle}</td>

    </tr>

    </#list>
    <tr class="r7">
        <td class="c11">合计</td>
        <td role="data" n="herdspig" class="c2">${sum.herdspig}</td>
        <td role="data" n="herdsniu" class="c2">${sum.herdsniu}</td>
        <td role="data" n="herdssheep" class="c2">${sum.herdssheep}</td>
        <td role="data" n="herdsother" class="c2">${sum.herdsother}</td>
        <td role="data" n="herdschicken" class="c2">${sum.herdschicken}</td>
        <td role="data" n="herdsduck" class="c2">${sum.herdsduck}</td>
        <td role="data" n="herdsgoose" class="c2">${sum.herdsgoose}</td>
        <td role="data" n="herdsotherq" class="c2">${sum.herdsotherq}</td>
        <td role="data" n="immunebirdfluchecken" class="c2">${sum.immunebirdfluchecken}</td>
        <td role="data" n="immunebirdfluduck" class="c2">${sum.immunebirdfluduck}</td>
        <td role="data" n="immunebirdflugoose" class="c2">${sum.immunebirdflugoose}</td>
        <td role="data" n="immunebirdfluother" class="c2">${sum.immunebirdfluother}</td>
        <td role="data" n="immuneafmdniu" class="c2">${sum.immuneafmdniu}</td>
        <td role="data" n="immuneafmdsheep" class="c2">${sum.immuneafmdsheep}</td>
        <td role="data" n="immuneblueear" class="c2">${sum.immuneblueear}</td>
        <td role="data" n="immuneswine" class="c2">${sum.immuneswine}</td>
        <td role="data" n="immunenewcastle" class="c2">${sum.immunenewcastle}</td>
        <td role="data" n="immunefmdpig" class="c2">${sum.immunefmdpig}</td>
        <td role="data" n="immunefmdniu" class="c2">${sum.immunefmdniu}</td>
        <td role="data" n="immunefmdsheep" class="c6">${sum.immunefmdsheep}</td>
        <td role="data" n="immunefmdother" class="c2">${sum.immunefmdother}</td>
    </tr>
    </tbody>
</table>
