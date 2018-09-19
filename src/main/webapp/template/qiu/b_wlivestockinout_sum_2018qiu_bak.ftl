<style type="text/css">

    .t1 {width:100%;
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
        <td class="c1" colspan="36">${templateName}</td>
    </tr>
    <tr class="r6">
        <td class="c2" rowspan="2">省份</td>
        

        <td class="c2" colspan="8">存栏数量（万头/只/羽）</td>
        <td class="c2" colspan="2">牲畜O型口蹄疫应免数量（万头/只）</td>
        <td class="c2" colspan="4">O型-A型口蹄疫应免数量（万头/只）</td>
        <td class="c2" colspan="2">O型-亚I型口蹄疫应免数量（万头/只）</td>
        <td class="c2" colspan="4">O型-A型-亚I型口蹄疫应免数量（万头/只）</td>
        <td class="c2" colspan="4">A型口蹄疫应免数量（万头/只）</td>

        <td class="c2" colspan="4">禽流感应免数量（万羽）</td>
        <td class="c2">高致病性猪蓝耳病应免数量（万头）</td>
        <td class="c2">猪瘟应免数量（万头）</td>
        <td class="c2">新城疫应免数量（万羽）</td>
        <td class="c2">小反刍兽疫应免数量（万只）</td>
        <td class="c2" colspan="2">布鲁氏菌病应免数量（万头/只）</td>
        <td class="c2">包虫病应免数量（万只）</td>
    </tr>
    <tr class="r7">
        <!-- 存栏量 -->
        <td class="c2">猪</td>
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <td class="c2">其它畜</td>
        <td class="c2">鸡</td>
        <td class="c2">鸭</td>
        <td class="c2">鹅</td>
        <td class="c2">其它禽</td>
        <!-- 口蹄疫  -->
        <!--O型 -->
        <td class="c2">猪</td>
        <td class="c2">其它畜</td>
        <!--O-A型 -->
        <td class="c2">猪</td>
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <td class="c2">其它畜</td>
        <!--O-亚I型 -->
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <!--O-A-亚I型 -->
        <td class="c2">猪</td>
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <td class="c2">其它畜</td>
        <!--A型 -->
        <td class="c2">猪</td>
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <td class="c2">其它畜</td>
        <!-- 禽流感  -->
        <td class="c2">鸡</td>
        <td class="c2">鸭</td>
        <td class="c2">鹅</td>
        <td class="c2">其它禽</td>
        <!-- 猪蓝耳-->
        <td class="c2">猪</td>
        <!-- 猪瘟-->
        <td class="c2">猪</td>
        <!-- 新城疫-->
        <td class="c2">鸡</td>
        <!-- 小反刍兽疫-->
        <td class="c2">羊</td>
        <!-- 布鲁氏菌病-->
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <!-- 包虫病-->
        <td class="c2">羊</td>
    </tr>
    <#list items as item>
    <tr class="r7">
        <td class="c9">${item.livRegionname}</td>
        <!-- 存栏量 -->
        <td n="herdspig" class="c2">${item.herdspig}</td>
        <td n="herdsniu" class="c2">${item.herdsniu}</td>
        <td n="herdssheep" class="c2">${item.herdssheep}</td>
        <td n="herdsother" class="c2">${item.herdsother}</td>
        <td n="herdschicken" class="c2">${item.herdschicken}</td>
        <td n="herdsduck" class="c2">${item.herdsduck}</td>
        <td n="herdsgoose" class="c2">${item.herdsgoose}</td>
        <td n="herdsotherq" class="c2">${item.herdsotherq}</td>
        <!-- 口蹄疫  -->
        <!--O型 -->
        <td n="immunefmdpig" class="c2">${item.immunefmdpig}</td>
        <td n="immunefmdother" class="c2">${item.immunefmdother}</td>
        <!--O-A型 -->
        <td n="immuneOafmdzhu" class="c2">${item.immuneOafmdzhu}</td>
        <td n="immuneOafmdniu" class="c2">${item.immuneOafmdniu}</td>
        <td n="immuneOafmdsheep" class="c2">${item.immuneOafmdsheep}</td>
        <td n="immuneOafmdother" class="c2">${item.immuneOafmdother}</td>
        <!--O-亚I型 -->
        <td n="immuneOifmdniu" class="c2">${item.immuneOifmdniu}</td>
        <td n="immuneOifmdSheep" class="c2">${item.immuneOifmdSheep}</td>
        <!--O-A-亚I型 -->
        <td n="immuneOaifmdzhu" class="c2">${item.immuneOaifmdzhu}</td>
        <td n="immuneOaifmdniu" class="c2">${item.immuneOaifmdniu}</td>
        <td n="immuneOaifmdsheep" class="c2">${item.immuneOaifmdsheep}</td>
        <td n="immuneOaifmdother" class="c2">${item.immuneOaifmdother}</td>
        <!--A型 -->
        <td n="immuneafmdzhu" class="c2">${item.immuneafmdzhu}</td>
        <td n="immuneafmdniu" class="c2">${item.immuneafmdniu}</td>
        <td n="immuneafmdsheep" class="c2">${item.immuneafmdsheep}</td>
        <td n="immuneafmdother" class="c2">${item.immuneafmdother}</td>
        <!-- 禽流感  -->
        <td n="immunebirdfluchecken" class="c2">${item.immunebirdfluchecken}</td>
        <td n="immunebirdfluduck" class="c2">${item.immunebirdfluduck}</td>
        <td n="immunebirdflugoose" class="c2">${item.immunebirdflugoose}</td>
        <td n="immunebirdfluother" class="c2">${item.immunebirdfluother}</td>
        <!-- 猪蓝耳-->
        <td n="immuneblueear" class="c2">${item.immuneblueear}</td>
        <!-- 猪瘟-->
        <td n="immuneswine" class="c2">${item.immuneswine}</td>
        <!-- 新城疫-->
        <td n="immunenewcastle" class="c2">${item.immunenewcastle}</td>
        <!-- 小反刍兽疫-->
        <td n="pestedespetitsruminants" class="c2">${item.pestedespetitsruminants}</td>
        <!-- 布鲁氏菌病-->
        <td n="immuneBruniu" class="c2"><#if item.immuneBruniu??>${item.immuneBruniu}</#if></td>
        <td n="immuneBruSheep" class="c2"><#if item.immuneBruSheep??>${item.immuneBruSheep}</#if></td>
        <!-- 包虫病-->
        <td n="immuneEchSheep"  class="c2"><#if item.immuneEchSheep??>${item.immuneEchSheep}</#if></td>
    </tr>

    </#list>
    <tr class="r7">
        <td class="c11">合计</td>
        <!-- 存栏量 -->
        <td n="herdspig" class="c2">${sum.herdspig}</td>
        <td n="herdsniu" class="c2">${sum.herdsniu}</td>
        <td n="herdssheep" class="c2">${sum.herdssheep}</td>
        <td n="herdsother" class="c2">${sum.herdsother}</td>
        <td n="herdschicken" class="c2">${sum.herdschicken}</td>
        <td n="herdsduck" class="c2">${sum.herdsduck}</td>
        <td n="herdsgoose" class="c2">${sum.herdsgoose}</td>
        <td n="herdsotherq" class="c2">${sum.herdsotherq}</td>
        <!-- 口蹄疫  -->
        <!--O型 -->
        <td n="immunefmdpig" class="c2">${sum.immunefmdpig}</td>
        <td n="immunefmdother" class="c2">${sum.immunefmdother}</td>
        <!--O-A型 -->
        <td n="immuneOafmdzhu" class="c2">${sum.immuneOafmdzhu}</td>
        <td n="immuneOafmdniu" class="c2">${sum.immuneOafmdniu}</td>
        <td n="immuneOafmdsheep" class="c2">${sum.immuneOafmdsheep}</td>
        <td n="immuneOafmdother" class="c2">${sum.immuneOafmdother}</td>
        <!--O-亚I型 -->
        <td n="immuneOifmdniu" class="c2">${sum.immuneOifmdniu}</td>
        <td n="immuneOifmdSheep" class="c2">${sum.immuneOifmdSheep}</td>
        <!--O-A-亚I型 -->
        <td n="immuneOaifmdzhu" class="c2">${sum.immuneOaifmdzhu}</td>
        <td n="immuneOaifmdniu" class="c2">${sum.immuneOaifmdniu}</td>
        <td n="immuneOaifmdsheep" class="c2">${sum.immuneOaifmdsheep}</td>
        <td n="immuneOaifmdother" class="c2">${sum.immuneOaifmdother}</td>
        <!--A型 -->
        <td n="immuneafmdzhu" class="c2">${sum.immuneafmdzhu}</td>
        <td n="immuneafmdniu" class="c2">${sum.immuneafmdniu}</td>
        <td n="immuneafmdsheep" class="c2">${sum.immuneafmdsheep}</td>
        <td n="immuneafmdother" class="c2">${sum.immuneafmdother}</td>
        <!-- 禽流感  -->
        <td n="immunebirdfluchecken" class="c2">${sum.immunebirdfluchecken}</td>
        <td n="immunebirdfluduck" class="c2">${sum.immunebirdfluduck}</td>
        <td n="immunebirdflugoose" class="c2">${sum.immunebirdflugoose}</td>
        <td n="immunebirdfluother" class="c2">${sum.immunebirdfluother}</td>
        <!-- 猪蓝耳-->
        <td n="immuneblueear" class="c2">${sum.immuneblueear}</td>
        <!-- 猪瘟-->
        <td n="immuneswine" class="c2">${sum.immuneswine}</td>
        <!-- 新城疫-->
        <td n="immunenewcastle" class="c2">${sum.immunenewcastle}</td>
        <!-- 小反刍兽疫-->
        <td n="pestedespetitsruminants" class="c2">${sum.pestedespetitsruminants}</td>
        <!-- 布鲁氏菌病-->
        <td n="immuneBruniu" class="c2"><#if sum.immuneBruniu??>${sum.immuneBruniu}</#if></td>
        <td n="immuneBruSheep" class="c2"><#if sum.immuneBruSheep??>${sum.immuneBruSheep}</#if></td>
        <!-- 包虫病-->
        <td n="immuneEchSheep"  class="c2"><#if sum.immuneEchSheep??>${sum.immuneEchSheep}</#if></td>
    </tr>
    </tbody>
</table>
