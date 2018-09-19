<html>
<head>
    <META http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style type="text/css">
        .t1 {
            width: 100%;
            border-collapse: collapse;
            border-spacing: 0;
        }

        .r1 {
            height: 22.5pt;
        }

        .r2 {
            height: 15.0pt;
        }

        .r3 {
            height: 16.5pt;
        }

        .r4 {
            height: 31.5pt;
        }

        .r5 {
            height: 28.5pt;
        }

        .r6 {
            height: 27.75pt;
        }

        .r7 {
            height: 21.75pt;
        }

        .c1 {
            white-space: pre-wrap;
            text-align: center;
            border-top: thin solid black;
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
            text-align: left;
            color: black;
            font-size: 10pt;
        }

        .c4 {
            white-space: pre-wrap;
            text-align: center;
            border-top: thin solid black;
            border-right: thin solid black;
            border-bottom: thin solid black;
            border-left: thin solid black;
            color: black;
            font-size: 10pt;
        }

        .c5 {
            white-space: pre-wrap;
            text-align: left;
            border-top: thin solid black;
            border-right: thin solid black;
            border-bottom: thin solid black;
            color: black;
            font-size: 10pt;
        }

        .c6 {
            white-space: pre-wrap;
            text-align: left;
            border-top: thin solid black;
            border-bottom: thin solid black;
            border-left: thin solid black;
            color: black;
            font-size: 10pt;
        }

        .c7 {
            white-space: pre-wrap;
            text-align: center;
            background-color: #ff8080;
            border-top: thin solid black;
            border-right: thin solid black;
            border-bottom: thin solid black;
            border-left: thin solid black;
            color: black;
            font-size: 10pt;
        }

        .c8 {
            white-space: pre-wrap;
            text-align: left;
            background-color: #ff8080;
            border-top: thin solid black;
            border-bottom: thin solid black;
            border-left: thin solid black;
            color: black;
            font-size: 10pt;
        }

        .c9 {
            white-space: pre-wrap;
            text-align: center;
            background-color: #ff8080;
            border-top: thin solid black;
            border-right: thin solid black;
            border-bottom: thin solid black;
            border-left: thin solid black;
            font-weight: bold;
            color: black;
            font-size: 10pt;
        }

        .c10 {
            white-space: pre-wrap;
            text-align: left;
            background-color: #ff8080;
            border-top: thin solid black;
            border-right: thin solid black;
            border-bottom: thin solid black;
            color: black;
            font-size: 10pt;
        }

        .c11 {
            white-space: pre-wrap;
            text-align: right;
            color: black;
            font-size: 10pt;
        }

        .c12 {
            white-space: pre-wrap;
            text-align: left;
            font-size: 10pt;
        }

        .c13 {
            white-space: pre-wrap;
            text-align: left;
            border-top: thin solid black;
            border-bottom: thin solid black;
            border-left: thin solid black;
            font-size: 10pt;
        }

        .c14 {
            white-space: pre-wrap;
            text-align: left;
            border-top: thin solid black;
            border-right: thin solid black;
            border-bottom: thin solid black;
            border-left: thin solid black;
            font-size: 10pt;
        }

        .c15 {
            white-space: pre-wrap;
            text-align: left;
            border-left: thin solid black;
            font-weight: bold;
            font-size: 10pt;
        }

        .c16 {
            white-space: pre-wrap;
            text-align: left;
            font-weight: bold;
            font-size: 10pt;
        }

        .c17 {
            white-space: pre-wrap;
            border-left: thin solid black;
            font-size: 10pt;
        }

        .c18 {
            white-space: pre-wrap;
            text-align: left;
            border-top: thin solid black;
            border-right: thin solid black;
            border-left: thin solid black;
            color: black;
            font-size: 10pt;
        }

        .c19 {
            white-space: pre-wrap;
            text-align: left;
            border-top: thin solid black;
            border-right: thin solid black;
            border-left: thin solid black;
            font-size: 10pt;
        }
    </style>
</head>
<body class="b1">
<table class="t1">
    <colgroup>
        <col width="118">
        <col width="87">
        <col width="83">
        <col width="57">
        <col width="52">
        <col width="57">
        <col width="62">
        <col width="66">
        <col width="66">
        <col width="66">
        <col width="66">
        <col width="66">
        <col width="59">
        <col width="49">
        <col width="52">
        <col width="58">
        <col width="59">
        <col width="61">
        <col width="65">
        <col width="59">
        <col width="58">
        <col width="59">
        <col width="48">
        <col width="61">
        <col width="61">
        <col width="61">
        <col width="19">
    </colgroup>
    <tbody>
    <tr class="r1">
        <td class="c2" colspan="22">${templateName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">单 位</td>
        <td class="c4" colspan="21">${org.orgName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">填表日期</td>
        <td class="c4" colspan="21"><#if report.reportTime??>${report.reportTime?string("yyyy-MM-dd")}</#if></td>
    </tr>
    <tr class="r2">
        <td class="c2">填 表 人</td>
        <td class="c4" colspan="21">${user.realName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">主管领导</td>
        <td class="c4" colspan="21">${user.leaderName}</td>
    </tr>
    <tr class="r3">
        <td class="c2" rowspan="2">疫苗种类</td>
        <td class="c2" rowspan="2">本周疫苗使用数量(万毫升)</td>
        <td class="c2" rowspan="2">累计疫苗使用数量(万毫升)</td>
        <td class="c2" colspan="4">本周免疫数量（万头/只）</td>
        <td class="c2" colspan="5">累计免疫数量(万头/只)</td>
        <td class="c2" colspan="5">应免数量(万头/只)</td>
        <td class="c2" colspan="5">免疫进展(%)</td>
    </tr>
    <tr class="r4">
        <td class="c2">猪</td>
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <td class="c2">其它动物</td>
        <td class="c2">猪</td>
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <td class="c2">其它动物</td>
        <td class="c6">合计</td>
        <td class="c2">猪</td>
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <td class="c2">其它动物</td>
        <td class="c4">合计</td>
        <td class="c2">猪</td>
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <td class="c2">其它动物</td>
        <td class="c2">合计</td>
    </tr>
    <tr class="r5">
        <td class="c2">口蹄疫O型灭活类疫苗</td>
        <td role="data" n="fmdInactivatedvaccine"
            class="c2"><#if item.fmdInactivatedvaccine??>${item.fmdInactivatedvaccine}</#if></td>
        <td role="lj_fmdInactivatedvaccine"
            class="c7"><#if itemSum.fmdInactivatedvaccine??>${itemSum.fmdInactivatedvaccine} </#if></td>
        <td role="data" n="fmdInactivatedimmuneamountpig"
            class="c2"><#if item.fmdInactivatedimmuneamountpig??>${item.fmdInactivatedimmuneamountpig}</#if></td>
        <td role="data" n="fmdInactivatedimmuneamountniu"
            class="c2"><#if item.fmdInactivatedimmuneamountniu??>${item.fmdInactivatedimmuneamountniu}</#if></td>
        <td role="data" n="fmdInactivatedimmuneamountsheep"
            class="c2"><#if item.fmdInactivatedimmuneamountsheep??>${item.fmdInactivatedimmuneamountsheep}</#if></td>
        <td role="data" n="fmdInactivatedimmuneamountother"
            class="c2"><#if item.fmdInactivatedimmuneamountother??>${item.fmdInactivatedimmuneamountother}</#if></td>
        <td role="lj_fmdInactivatedimmuneamountpig"
            class="c7"><#if itemSum.fmdInactivatedimmuneamountpig??>${itemSum.fmdInactivatedimmuneamountpig}</#if></td>
        <td role="lj_fmdInactivatedimmuneamountniu"
            class="c7"><#if itemSum.fmdInactivatedimmuneamountniu??>${itemSum.fmdInactivatedimmuneamountniu}</#if></td>
        <td role="lj_fmdInactivatedimmuneamountsheep"
            class="c7"><#if itemSum.fmdInactivatedimmuneamountsheep??>${itemSum.fmdInactivatedimmuneamountsheep}</#if></td>
        <td role="lj_fmdInactivatedimmuneamountother"
            class="c7"><#if itemSum.fmdInactivatedimmuneamountother??>${itemSum.fmdInactivatedimmuneamountother}</#if></td>
        <td role="lj_sum1"
            class="c8"><#if itemSum??>${itemSum.fmdInactivatedimmuneamountpig?default(0)+itemSum.fmdInactivatedimmuneamountniu?default(0)+itemSum.fmdInactivatedimmuneamountsheep?default(0)+itemSum.fmdInactivatedimmuneamountother?default(0)}</#if></td>
        <td n="immunefmdpig" class="c8"
            ><#if wlivestockinout.immunefmdpig??>${wlivestockinout.immunefmdpig}</#if></td>
        <td n="immunefmdniu" class="c8"
            ><#if wlivestockinout.immunefmdniu??>${wlivestockinout.immunefmdniu}</#if></td>
        <td n="immunefmdsheep" class="c8"
            ><#if wlivestockinout.immunefmdsheep??>${wlivestockinout.immunefmdsheep}</#if></td>

        <td n="immunefmdother" class="c9"
            ><#if wlivestockinout.immunefmdother??>${wlivestockinout.immunefmdother}</#if></td>
        <td n="immunefmdoSum" class="c9"
            ><#if wlivestockinout??>${wlivestockinout.immunefmdpig?default(0)+wlivestockinout.immunefmdniu?default(0)+wlivestockinout.immunefmdsheep?default(0)+wlivestockinout.immunefmdother?default(0)}</#if></td>
        <td n="jz_fmdopig" class="c10"
            ><#if (wlivestockinout.immunefmdpig??&&wlivestockinout.immunefmdpig>0)>
        ${(itemSum.fmdInactivatedimmuneamountpig?default(0)+itemSum.fmdOaimmuneamountzhu?default(0)+itemSum.fmdO3immuneamountpig?default(0))*100/wlivestockinout.immunefmdpig}%</#if>
        </td>
        <td n="jz_fmdoniu" class="c10"
            ><#if (wlivestockinout.immunefmdniu??&&wlivestockinout.immunefmdniu>0)>
        ${(itemSum.fmdInactivatedimmuneamountniu?default(0)+itemSum.fmdOaimmuneamountniu?default(0)+itemSum.fmdO3immuneamountniu?default(0)+itemSum.fmdO2immuneamountniu?default(0))*100/wlivestockinout.immunefmdniu}%</#if>
        </td>
        <td n="jz_fmdosheep" class="c10"
            ><#if (wlivestockinout.immunefmdsheep??&&wlivestockinout.immunefmdsheep>0)>
        ${(itemSum.fmdInactivatedimmuneamountsheep?default(0)+itemSum.fmdOaimmuneamountsheep?default(0)+itemSum.fmdO3immuneamountsheep?default(0)+itemSum.fmdO2immuneamountsheep?default(0))*100/wlivestockinout.immunefmdsheep}%</#if>
        </td>
        <td n="jz_fmdoother" class="c8"
            ><#if (wlivestockinout.immunefmdother??&&wlivestockinout.immunefmdother>0)>${(itemSum.fmdInactivatedimmuneamountother?default(0)+itemSum.fmdOaimmuneamountother?default(0)+itemSum.fmdO3immuneamountother?default(0)+itemSum.fmdO2immuneamountother?default(0))*100/wlivestockinout.immunefmdother}%</#if></td>

        <td n="jz_fmdosum" class="c7"
            ><#if (wlivestockinout??&&(wlivestockinout.immunefmdpig?default(0)+wlivestockinout.immunefmdniu?default(0)+wlivestockinout.immunefmdsheep?default(0)+wlivestockinout.immunefmdother?default(0))>0)>${(itemSum.fmdInactivatedimmuneamountpig?default(0)+itemSum.fmdOaimmuneamountzhu?default(0)+itemSum.fmdO3immuneamountpig?default(0)
        +itemSum.fmdInactivatedimmuneamountniu?default(0)+itemSum.fmdOaimmuneamountniu?default(0)+itemSum.fmdO3immuneamountniu?default(0)+itemSum.fmdO2immuneamountniu?default(0)
        +itemSum.fmdInactivatedimmuneamountsheep?default(0)++itemSum.fmdOaimmuneamountsheep?default(0)+itemSum.fmdO2immuneamountsheep?default(0)+itemSum.fmdO3immuneamountsheep?default(0)
        +itemSum.fmdInactivatedimmuneamountother?default(0)+itemSum.fmdOaimmuneamountother?default(0)+itemSum.fmdO3immuneamountother?default(0)+itemSum.fmdO2immuneamountother?default(0))*100/(wlivestockinout.immunefmdpig?default(0)+wlivestockinout.immunefmdniu?default(0)+wlivestockinout.immunefmdsheep?default(0)+wlivestockinout.immunefmdother?default(0))}%</#if>
        </td>
    </tr>
    <input id="fmdInactivatedvaccine" type="hidden"
           value="${itemSum.fmdInactivatedvaccine?default(0)-item.fmdInactivatedvaccine?default(0)}"/>
    <input id="fmdInactivatedimmuneamountpig" type="hidden"
           value="${itemSum.fmdInactivatedimmuneamountpig?default(0)-item.fmdInactivatedimmuneamountpig?default(0)}"/>
    <input id="fmdInactivatedimmuneamountniu" type="hidden"
           value="${itemSum.fmdInactivatedimmuneamountniu?default(0)-item.fmdInactivatedimmuneamountniu?default(0)}"/>
    <input id="fmdInactivatedimmuneamountsheep" type="hidden"
           value="${itemSum.fmdInactivatedimmuneamountsheep?default(0)-item.fmdInactivatedimmuneamountsheep?default(0)}"/>
     <input id="fmdInactivatedimmuneamountother" type="hidden"
           value="${itemSum.fmdInactivatedimmuneamountother?default(0)-item.fmdInactivatedimmuneamountother?default(0)}"/>
    <tr class="r5">
        <td class="c2">口蹄疫O型-A型二价灭活疫苗</td>
        <td role="data" n="fmdOavaccine" class="c2">${item.fmdOavaccine}</td>
        <td role="lj_fmdOavaccine" class="c7"><#if itemSum.fmdOavaccine??>${itemSum.fmdOavaccine}</#if></td>
        <td role="data" n="fmdOaimmuneamountzhu"
            class="c2"><#if item.fmdOaimmuneamountzhu??>${item.fmdOaimmuneamountzhu}</#if></td>
        <td role="data" n="fmdOaimmuneamountniu"
            class="c2"><#if item.fmdOaimmuneamountniu??>${item.fmdOaimmuneamountniu}</#if></td>
        <td role="data" n="fmdOaimmuneamountsheep"
            class="c2"><#if item.fmdOaimmuneamountsheep??>${item.fmdOaimmuneamountsheep}</#if></td>
        <td role="data" n="fmdOaimmuneamountother"
            class="c2"><#if item.fmdOaimmuneamountother??>${item.fmdOaimmuneamountother}</#if></td>
        <td role="lj_fmdOaimmuneamountzhu"
            class="c7"><#if itemSum.fmdOaimmuneamountzhu??>${itemSum.fmdOaimmuneamountzhu}</#if></td>
        <td role="lj_fmdOaimmuneamountniu"
            class="c7"><#if itemSum.fmdOaimmuneamountniu??>${itemSum.fmdOaimmuneamountniu}</#if></td>
        <td role="lj_fmdOaimmuneamountsheep"
            class="c7"><#if itemSum.fmdOaimmuneamountsheep??>${itemSum.fmdOaimmuneamountsheep}</#if></td>
        <td role="lj_fmdOaimmuneamountother"
            class="c7"><#if itemSum.fmdOaimmuneamountother??>${itemSum.fmdOaimmuneamountother}</#if></td>
        <td role="lj_sumOa"
            class="c8"><#if itemSum??>${itemSum.fmdOaimmuneamountzhu?default(0)+itemSum.fmdOaimmuneamountniu?default(0)+itemSum.fmdOaimmuneamountsheep?default(0)+itemSum.fmdOaimmuneamountother?default(0)}</#if></td>
        <td class="c2">/</td>
        <td class="c2">/</td>
        <td class="c2">/</td>
        <td class="c2">/</td>
        <td class="c2">/</td>
        <td class="c2">/</td>
        <td class="c2">/</td>
        <td class="c2">/</td>
        <td class="c2">/</td>
        <td class="c2">/</td>
    </tr>
    <input id="fmdOavaccine" type="hidden"
           value="${itemSum.fmdOavaccine?default(0)-item.fmdOavaccine?default(0)}"/>
    <input id="fmdOaimmuneamountzhu" type="hidden"
           value="${itemSum.fmdOaimmuneamountzhu?default(0)-item.fmdOaimmuneamountzhu?default(0)}"/>
    <input id="fmdOaimmuneamountniu" type="hidden"
           value="${itemSum.fmdOaimmuneamountniu?default(0)-item.fmdOaimmuneamountniu?default(0)}"/>
    <input id="fmdOaimmuneamountsheep" type="hidden"
           value="${itemSum.fmdOaimmuneamountsheep?default(0)-item.fmdOaimmuneamountsheep?default(0)}"/>
    <input id="fmdOaimmuneamountother" type="hidden"
           value="${itemSum.fmdOaimmuneamountother?default(0)-item.fmdOaimmuneamountother?default(0)}"/>
    <tr class="r5">
        <td class="c2">口蹄疫O型-A型-亚洲I型三价灭活疫苗</td>
        <td role="data" n="fmdO3vaccine" class="c2">${item.fmdO3vaccine}</td>
        <td role="lj_fmdO3vaccine" class="c7"><#if itemSum.fmdO3vaccine??>${itemSum.fmdO3vaccine}</#if></td>
        <td role="data" n="fmdO3immuneamountpig" class="c2">${item.fmdO3immuneamountpig}</td>
        <td role="data" n="fmdO3immuneamountniu" class="c2">${item.fmdO3immuneamountniu}</td>
        <td role="data" n="fmdO3immuneamountsheep" class="c2">${item.fmdO3immuneamountsheep}</td>
        <td role="data" n="fmdO3immuneamountother" class="c2">${item.fmdO3immuneamountother}</td>
        <td role="lj_fmdO3immuneamountpig"
            class="c7"><#if itemSum.fmdO3immuneamountpig??>${itemSum.fmdO3immuneamountpig}</#if></td>
        <td role="lj_fmdO3immuneamountniu"
            class="c7"><#if itemSum.fmdO3immuneamountniu??>${itemSum.fmdO3immuneamountniu}</#if></td>
        <td role="lj_fmdO3immuneamountsheep"
            class="c7"><#if itemSum.fmdO3immuneamountsheep??>${itemSum.fmdO3immuneamountsheep}</#if></td>
         <td role="lj_fmdO3immuneamountother"
            class="c7"><#if itemSum.fmdO3immuneamountother??>${itemSum.fmdO3immuneamountother}</#if></td>
        <td role="lj_sum3"
            class="c8"><#if itemSum??>${itemSum.fmdO3immuneamountpig?default(0)+itemSum.fmdO3immuneamountniu?default(0)+itemSum.fmdO3immuneamountsheep?default(0)+itemSum.fmdO3immuneamountother?default(0)}</#if></td>
        <td class="c2">/</td>
        <td class="c2">/</td>
        <td class="c2">/</td>
        <td class="c2">/</td>
        <td class="c2">/</td>
        <td class="c2">/</td>
        <td class="c2">/</td>
        <td class="c2">/</td>
        <td class="c2">/</td>
        <td class="c2">/</td>
    </tr>
    <input id="fmdO3vaccine" type="hidden" value="${itemSum.fmdO3vaccine?default(0)-item.fmdO3vaccine?default(0)}"/>
    <input id="fmdO3immuneamountpig" type="hidden"
           value="${itemSum.fmdO3immuneamountpig?default(0)-item.fmdO3immuneamountpig?default(0)}"/>
     <input id="fmdO3immuneamountniu" type="hidden"
           value="${itemSum.fmdO3immuneamountniu?default(0)-item.fmdO3immuneamountniu?default(0)}"/>
    <input id="fmdO3immuneamountsheep" type="hidden"
           value="${itemSum.fmdO3immuneamountsheep?default(0)-item.fmdO3immuneamountsheep?default(0)}"/>
    <input id="fmdO3immuneamountother" type="hidden"
           value="${itemSum.fmdO3immuneamountother?default(0)-item.fmdO3immuneamountother?default(0)}"/>
    <tr class="r5">
        <td class="c2">口蹄疫O型-亚洲I型二价灭活疫苗</td>
        <td role="data" n="fmdO2vaccine" class="c2"><#if item.fmdO2vaccine??>${item.fmdO2vaccine}</#if></td>
        <td role="lj_fmdO2vaccine" class="c7"><#if itemSum.fmdO2vaccine??>${itemSum.fmdO2vaccine}</#if></td>
        <td class="c2">/</td>
        <td role="data" n="fmdO2immuneamountniu"
            class="c2"><#if item.fmdO2immuneamountniu??>${item.fmdO2immuneamountniu}</#if></td>
        <td role="data" n="fmdO2immuneamountsheep"
            class="c2"><#if item.fmdO2immuneamountsheep??>${item.fmdO2immuneamountsheep}</#if></td>
        <td role="data" n="fmdO2immuneamountother"
            class="c2"><#if item.fmdO2immuneamountother??>${item.fmdO2immuneamountother}</#if></td>
        <td class="c2">/</td>
        <td role="lj_fmdO2immuneamountniu"
            class="c7"><#if itemSum.fmdO2immuneamountniu??>${itemSum.fmdO2immuneamountniu}</#if></td>
        <td role="lj_fmdO2immuneamountsheep"
            class="c7"><#if itemSum.fmdO2immuneamountsheep??>${itemSum.fmdO2immuneamountsheep}</#if></td>
        <td role="lj_fmdO2immuneamountother"
            class="c7"><#if itemSum.fmdO2immuneamountother??>${itemSum.fmdO2immuneamountother}</#if></td>
        <td role="lj_sum2"
            class="c8"><#if itemSum??>${itemSum.fmdO2immuneamountniu?default(0)+itemSum.fmdO2immuneamountsheep?default(0)+itemSum.fmdO2immuneamountother?default(0)}</#if></td>
        <td class="c2">/</td>
        <td class="c2">/</td>
        <td class="c2">/</td>
        <td class="c2">/</td>
        <td class="c2">/</td>
        <td class="c2">/</td>
        <td class="c2">/</td>
        <td class="c2">/</td>
        <td class="c2">/</td>
        <td class="c2">/</td>
    </tr>
    <input id="fmdO2vaccine" type="hidden" value="${itemSum.fmdO2vaccine?default(0)-item.fmdO2vaccine?default(0)}"/>
    <input id="fmdO2immuneamountniu" type="hidden"
           value="${itemSum.fmdO2immuneamountniu?default(0)-item.fmdO2immuneamountniu?default(0)}"/>
    <input id="fmdO2immuneamountsheep" type="hidden"
           value="${itemSum.fmdO2immuneamountsheep?default(0)-item.fmdO2immuneamountsheep?default(0)}"/>
    <input id="fmdO2immuneamountother" type="hidden"
           value="${itemSum.fmdO2immuneamountother?default(0)-item.fmdO2immuneamountother?default(0)}"/>


    <tr class="r6">
        <td class="c2">口蹄疫A型灭活疫苗</td>
        <td role="data" n="fmdAvaccine" class="c2">${item.fmdAvaccine}</td>
        <td role="lj_fmdAvaccine" class="c7"><#if itemSum.fmdAvaccine??>${itemSum.fmdAvaccine}</#if></td>

        <td role="data" n="fmdAimmuneamountzhu" class="c2">${item.fmdAimmuneamountzhu}</td>
        <td role="data" n="fmdAimmuneamountniu" class="c2">${item.fmdAimmuneamountniu}</td>
        <td role="data" n="fmdAimmuneamountsheep" class="c2">${item.fmdAimmuneamountsheep}</td>
        <td role="data" n="fmdAimmuneamountother" class="c2">${item.fmdAimmuneamountother}</td>
        <td role="lj_fmdAimmuneamountzhu"
            class="c7"><#if itemSum.fmdAimmuneamountzhu??>${itemSum.fmdAimmuneamountzhu}</#if></td>
        <td role="lj_fmdAimmuneamountniu"
            class="c7"><#if itemSum.fmdAimmuneamountniu??>${itemSum.fmdAimmuneamountniu}</#if></td>
        <td role="lj_fmdAimmuneamountsheep"
            class="c7"><#if itemSum.fmdAimmuneamountsheep??>${itemSum.fmdAimmuneamountsheep}</#if></td>
        <td role="lj_fmdAimmuneamountother"
            class="c7"><#if itemSum.fmdAimmuneamountother??>${itemSum.fmdAimmuneamountother}</#if></td>
        <td role="lj_sum4"
            class="c8"><#if itemSum??>${itemSum.fmdAimmuneamountzhu?default(0)+itemSum.fmdAimmuneamountniu?default(0)+itemSum.fmdAimmuneamountsheep?default(0)+itemSum.fmdAimmuneamountother?default(0)}</#if></td>
        <td n="immuneafmdzhu"
            class="c9"><#if wlivestockinout.immuneafmdzhu??>${wlivestockinout.immuneafmdzhu}</#if></td>
        <td n="immuneafmdniu"
            class="c9"><#if wlivestockinout.immuneafmdniu??>${wlivestockinout.immuneafmdniu}</#if></td>
        <td n="immuneafmdsheep"
            class="c9"><#if wlivestockinout.immuneafmdsheep??>${wlivestockinout.immuneafmdsheep}</#if></td>
        <td n="immuneafmdother"
            class="c9"><#if wlivestockinout.immuneafmdother??>${wlivestockinout.immuneafmdother}</#if></td>
        <td n="immunefmdaSum"
            class="c9"><#if wlivestockinout??>${wlivestockinout.immuneafmdzhu?default(0)+wlivestockinout.immuneafmdniu?default(0)+wlivestockinout.immuneafmdsheep?default(0)+wlivestockinout.immuneafmdother?default(0)}</#if></td>
        <td n="jz_fmdazhu" class="c7"><#if (wlivestockinout.immuneafmdzhu??&&wlivestockinout.immuneafmdzhu>0)>${itemSum.fmdAimmuneamountzhu?default(0)*100/wlivestockinout.immuneafmdzhu}%</#if></td>
        <td n="jz_fmdaniu" class="c7"><#if (wlivestockinout.immuneafmdniu??&&wlivestockinout.immuneafmdniu>0)>${itemSum.fmdAimmuneamountniu?default(0)*100/wlivestockinout.immuneafmdniu}%</#if></td>
        <td n="jz_fmdasheep" class="c7"><#if (wlivestockinout.immuneafmdsheep??&&wlivestockinout.immuneafmdsheep>0)>${itemSum.fmdAimmuneamountsheep?default(0)*100/wlivestockinout.immuneafmdsheep}%</#if></td>
        <td n="jz_fmdaother" class="c7"><#if (wlivestockinout.immuneafmdother??&&wlivestockinout.immuneafmdother>0)>${itemSum.fmdAimmuneamountother?default(0)*100/wlivestockinout.immuneafmdother}%</#if></td>
        <td n="jz_sum2" class="c7"><#if (wlivestockinout??&&(wlivestockinout.immuneafmdzhu?default(0)+wlivestockinout.immuneafmdniu?default(0)+wlivestockinout.immuneafmdsheep?default(0)+wlivestockinout.immuneafmdother?default(0))>0)>${(itemSum.fmdAimmuneamountzhu?default(0)+itemSum.fmdAimmuneamountniu?default(0)+itemSum.fmdAimmuneamountsheep?default(0)+itemSum.fmdAimmuneamountother?default(0))*100/(wlivestockinout.immuneafmdzhu?default(0)+wlivestockinout.immuneafmdniu?default(0)+wlivestockinout.immuneafmdsheep?default(0)+wlivestockinout.immuneafmdother?default(0))}%</#if></td>
    </tr>
    <input id="fmdAvaccine" type="hidden" value="${itemSum.fmdAvaccine?default(0)-item.fmdAvaccine?default(0)}"/>
    <input id="fmdAimmuneamountzhu" type="hidden"
           value="${itemSum.fmdAimmuneamountzhu?default(0)-item.fmdAimmuneamountzhu?default(0)}"/>
    <input id="fmdAimmuneamountniu" type="hidden"
           value="${itemSum.fmdAimmuneamountniu?default(0)-item.fmdAimmuneamountniu?default(0)}"/>
    <input id="fmdAimmuneamountsheep" type="hidden"
           value="${itemSum.fmdAimmuneamountsheep?default(0)-item.fmdAimmuneamountsheep?default(0)}"/>
    <input id="fmdAimmuneamountother" type="hidden"
           value="${itemSum.fmdAimmuneamountother?default(0)-item.fmdAimmuneamountother?default(0)}"/>
    <tr class="r3">
        <td class="c2" rowspan="4">填表说明：</td>
        <td class="c4" colspan="21">1.本周免疫数量是指填报本周的免疫数量；</td>
    </tr>
    <tr class="r3">
        <td class="c4" colspan="21">2.使用疫苗种类与其使用数量、免疫动物数量相对应；</td>
    </tr>
    <tr class="r3">
        <td class="c4" colspan="21">3.没有数字填报，请填&ldquo;0&rdquo;；</td>
    </tr>
    <tr class="r3">
        <td class="c4" colspan="21">4.填报数字请保留至小数点后2位。</td>
    </tr>
    </tbody>
</table>
<input type="hidden" id="valid"/>
<input type="hidden" id="valid-msg"/>
</body>
</html>
<script type="text/javascript">
    (function ($, window, document, undefined) {
        $("td[role=data]").each(function (i, d) {
            var n = $(this).attr("n")
            $(this).off("click")
            $(this).on("click", function (e) {
                $("td[role=data]").each(function (e) {
                    $(this).attr("current", 0)
                })
                $(this).attr("current", 1)
                $("td[current=0]").find("input").each(function (e) {
                    var v = $(this).val()
                    $(this).parent("td").html(v)
                    calculate()
                })
                var oldText = $(this).text()
                $(this).empty()
                var input = $('<input style="height: 100%;width:100%;min-width:100px;" type="text" name="' + n + '" value="' + oldText + '">')
                input.on("blur", function (e) {
                    var v = $(this).val()
                    $(this).parent("td").html(v)
                    calculate()
                })
                input.on("click", function (e) {
                    e.stopPropagation()
                })
                $(this).append(input);
                input.focus();
                input.select();
                e.stopPropagation()
            })
        })

        var calculate = function () {
            // 应免数量
            // O型
            var immunefmdpig = $.trim($('td[n="immunefmdpig"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="immunefmdpig"]').text()));
            var immunefmdniu = $.trim($('td[n="immunefmdniu"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="immunefmdniu"]').text()));
            var immunefmdsheep = $.trim($('td[n="immunefmdsheep"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="immunefmdsheep"]').text()));
            var immunefmdother = $.trim($('td[n="immunefmdother"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="immunefmdother"]').text()));
            var immunefmdoSum = (parseFloat(immunefmdpig) + parseFloat(immunefmdniu) + parseFloat(immunefmdsheep) + parseFloat(immunefmdother)).toFixed(2);
            // A型
            var immuneafmdzhu = $.trim($('td[n="immuneafmdzhu"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="immuneafmdzhu"]').text()));
            var immuneafmdniu = $.trim($('td[n="immuneafmdniu"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="immuneafmdniu"]').text()));
            var immuneafmdsheep = $.trim($('td[n="immuneafmdsheep"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="immuneafmdsheep"]').text()));
            var immuneafmdother = $.trim($('td[n="immuneafmdother"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="immuneafmdother"]').text()));
            var immunefmdaSum = (parseFloat(immuneafmdzhu) + parseFloat(immuneafmdniu)+ parseFloat(immuneafmdsheep)+ parseFloat(immuneafmdother)).toFixed(2);
            //疫苗使用数
            var fmdInactivatedvaccine = $.trim($('td[n="fmdInactivatedvaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdInactivatedvaccine"]').text()));
            var fmdO2vaccine = $.trim($('td[n="fmdO2vaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdO2vaccine"]').text()));
            var fmdO3vaccine = $.trim($('td[n="fmdO3vaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdO3vaccine"]').text()));
            var fmdOavaccine = $.trim($('td[n="fmdOavaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdOavaccine"]').text()));
            var fmdAvaccine = $.trim($('td[n="fmdAvaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdAvaccine"]').text()));
            // 本周免疫数量
            //O型灭活疫苗
            var fmdInactivatedimmuneamountpig = $.trim($('td[n="fmdInactivatedimmuneamountpig"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdInactivatedimmuneamountpig"]').text()));
            var fmdInactivatedimmuneamountniu = $.trim($('td[n="fmdInactivatedimmuneamountniu"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdInactivatedimmuneamountniu"]').text()));
            var fmdInactivatedimmuneamountsheep = $.trim($('td[n="fmdInactivatedimmuneamountsheep"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdInactivatedimmuneamountsheep"]').text()));
            var fmdInactivatedimmuneamountother = $.trim($('td[n="fmdInactivatedimmuneamountother"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdInactivatedimmuneamountother"]').text()));
            //O型-亚I型二价灭活疫苗
            var fmdO2immuneamountniu = $.trim($('td[n="fmdO2immuneamountniu"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdO2immuneamountniu"]').text()));
            var fmdO2immuneamountsheep = $.trim($('td[n="fmdO2immuneamountsheep"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdO2immuneamountsheep"]').text()));
            var fmdO2immuneamountother = $.trim($('td[n="fmdO2immuneamountother"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdO2immuneamountother"]').text()));
            //O型-A型-亚I型三价灭活疫苗
            var fmdO3immuneamountpig = $.trim($('td[n="fmdO3immuneamountpig"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdO3immuneamountpig"]').text()));
            var fmdO3immuneamountniu = $.trim($('td[n="fmdO3immuneamountniu"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdO3immuneamountniu"]').text()));
            var fmdO3immuneamountsheep = $.trim($('td[n="fmdO3immuneamountsheep"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdO3immuneamountsheep"]').text()));
            var fmdO3immuneamountother = $.trim($('td[n="fmdO3immuneamountother"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdO3immuneamountother"]').text()));
            //O型-A型二价灭活疫苗
            var fmdOaimmuneamountzhu = $.trim($('td[n="fmdOaimmuneamountzhu"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdOaimmuneamountzhu"]').text()));
            var fmdOaimmuneamountniu = $.trim($('td[n="fmdOaimmuneamountniu"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdOaimmuneamountniu"]').text()));
            var fmdOaimmuneamountsheep = $.trim($('td[n="fmdOaimmuneamountsheep"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdOaimmuneamountsheep"]').text()));
            var fmdOaimmuneamountother = $.trim($('td[n="fmdOaimmuneamountother"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdOaimmuneamountother"]').text()));
            //A型灭活疫苗
            var fmdAimmuneamountzhu = $.trim($('td[n="fmdAimmuneamountzhu"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdAimmuneamountzhu"]').text()));
            var fmdAimmuneamountniu = $.trim($('td[n="fmdAimmuneamountniu"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdAimmuneamountniu"]').text()));
            var fmdAimmuneamountsheep = $.trim($('td[n="fmdAimmuneamountsheep"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdAimmuneamountsheep"]').text()));
            var fmdAimmuneamountother = $.trim($('td[n="fmdAimmuneamountother"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdAimmuneamountother"]').text()));

            // 累计数量
            // 疫苗使用数量
            var lj_fmdInactivatedvaccine = document.getElementById('fmdInactivatedvaccine').value;
            var lj_fmdO2vaccine = document.getElementById('fmdO2vaccine').value;
            var lj_fmdO3vaccine = document.getElementById('fmdO3vaccine').value;
            var lj_fmdOavaccine = document.getElementById('fmdOavaccine').value;
            var lj_fmdAvaccine = document.getElementById('fmdAvaccine').value;
            // 免疫数量
            var lj_fmdInactivatedimmuneamountpig = document.getElementById('fmdInactivatedimmuneamountpig').value;
            var lj_fmdInactivatedimmuneamountniu = document.getElementById('fmdInactivatedimmuneamountniu').value;
            var lj_fmdInactivatedimmuneamountsheep = document.getElementById('fmdInactivatedimmuneamountsheep').value;
            var lj_fmdInactivatedimmuneamountother = document.getElementById('fmdInactivatedimmuneamountother').value;
            var lj_fmdO2immuneamountniu = document.getElementById('fmdO2immuneamountniu').value;
            var lj_fmdO2immuneamountsheep = document.getElementById('fmdO2immuneamountsheep').value;
            var lj_fmdO2immuneamountother = document.getElementById('fmdO2immuneamountother').value;

            var lj_fmdO3immuneamountpig = document.getElementById('fmdO3immuneamountpig').value;
            var lj_fmdO3immuneamountniu = document.getElementById('fmdO3immuneamountniu').value;
            var lj_fmdO3immuneamountsheep = document.getElementById('fmdO3immuneamountsheep').value;
            var lj_fmdO3immuneamountother = document.getElementById('fmdO3immuneamountother').value;

            var lj_fmdOaimmuneamountzhu = document.getElementById('fmdOaimmuneamountzhu').value;
            var lj_fmdOaimmuneamountniu = document.getElementById('fmdOaimmuneamountniu').value;
            var lj_fmdOaimmuneamountsheep = document.getElementById('fmdOaimmuneamountsheep').value;
            var lj_fmdOaimmuneamountother = document.getElementById('fmdOaimmuneamountother').value;

            var lj_fmdAimmuneamountzhu = document.getElementById('fmdAimmuneamountzhu').value;
            var lj_fmdAimmuneamountniu = document.getElementById('fmdAimmuneamountniu').value;
            var lj_fmdAimmuneamountsheep = document.getElementById('fmdAimmuneamountsheep').value;
            var lj_fmdAimmuneamountother = document.getElementById('fmdAimmuneamountother').value;
            // 总数量
            // 疫苗使用数量
            var sum_fmdInactivatedvaccine = (parseFloat(lj_fmdInactivatedvaccine) + parseFloat(fmdInactivatedvaccine)).toFixed(2);
            var sum_fmdO2vaccine = (parseFloat(lj_fmdO2vaccine) + parseFloat(fmdO2vaccine)).toFixed(2);
            var sum_fmdO3vaccine = (parseFloat(lj_fmdO3vaccine) + parseFloat(fmdO3vaccine)).toFixed(2);
            var sum_fmdOavaccine = (parseFloat(lj_fmdOavaccine) + parseFloat(fmdOavaccine)).toFixed(2);
            var sum_fmdAvaccine = (parseFloat(lj_fmdAvaccine) + parseFloat(fmdAvaccine)).toFixed(2);
            // 免疫数量
            var sum_fmdInactivatedimmuneamountpig = (parseFloat(lj_fmdInactivatedimmuneamountpig) + parseFloat(fmdInactivatedimmuneamountpig)).toFixed(2);
            var sum_fmdInactivatedimmuneamountniu = (parseFloat(lj_fmdInactivatedimmuneamountniu) + parseFloat(fmdInactivatedimmuneamountniu)).toFixed(2);
            var sum_fmdInactivatedimmuneamountsheep = (parseFloat(lj_fmdInactivatedimmuneamountsheep) + parseFloat(fmdInactivatedimmuneamountsheep)).toFixed(2);
            var sum_fmdInactivatedimmuneamountother = (parseFloat(lj_fmdInactivatedimmuneamountother) + parseFloat(fmdInactivatedimmuneamountother)).toFixed(2);

            var sum_fmdO2immuneamountniu = (parseFloat(lj_fmdO2immuneamountniu) + parseFloat(fmdO2immuneamountniu)).toFixed(2);
            var sum_fmdO2immuneamountsheep = (parseFloat(lj_fmdO2immuneamountsheep) + parseFloat(fmdO2immuneamountsheep)).toFixed(2);
            var sum_fmdO2immuneamountother = (parseFloat(lj_fmdO2immuneamountother) + parseFloat(fmdO2immuneamountother)).toFixed(2);

            var sum_fmdO3immuneamountpig = (parseFloat(lj_fmdO3immuneamountpig) + parseFloat(fmdO3immuneamountpig)).toFixed(2);
            var sum_fmdO3immuneamountniu = (parseFloat(lj_fmdO3immuneamountniu) + parseFloat(fmdO3immuneamountniu)).toFixed(2);
            var sum_fmdO3immuneamountsheep = (parseFloat(lj_fmdO3immuneamountsheep) + parseFloat(fmdO3immuneamountsheep)).toFixed(2);
            var sum_fmdO3immuneamountother = (parseFloat(lj_fmdO3immuneamountother) + parseFloat(fmdO3immuneamountother)).toFixed(2);

            var sum_fmdOaimmuneamountzhu = (parseFloat(lj_fmdOaimmuneamountzhu) + parseFloat(fmdOaimmuneamountzhu)).toFixed(2);
            var sum_fmdOaimmuneamountniu = (parseFloat(lj_fmdOaimmuneamountniu) + parseFloat(fmdOaimmuneamountniu)).toFixed(2);
            var sum_fmdOaimmuneamountsheep = (parseFloat(lj_fmdOaimmuneamountsheep) + parseFloat(fmdOaimmuneamountsheep)).toFixed(2);
            var sum_fmdOaimmuneamountother = (parseFloat(lj_fmdOaimmuneamountother) + parseFloat(fmdOaimmuneamountother)).toFixed(2);

            var sum_fmdAimmuneamountzhu = (parseFloat(lj_fmdAimmuneamountzhu) + parseFloat(fmdAimmuneamountzhu)).toFixed(2);
            var sum_fmdAimmuneamountniu = (parseFloat(lj_fmdAimmuneamountniu) + parseFloat(fmdAimmuneamountniu)).toFixed(2);
            var sum_fmdAimmuneamountsheep = (parseFloat(lj_fmdAimmuneamountsheep) + parseFloat(fmdAimmuneamountsheep)).toFixed(2);
            var sum_fmdAimmuneamountother = (parseFloat(lj_fmdAimmuneamountother) + parseFloat(fmdAimmuneamountother)).toFixed(2);


            var sum_fmdozhu = (parseFloat(sum_fmdInactivatedimmuneamountpig) + parseFloat(sum_fmdO3immuneamountpig)+ parseFloat(sum_fmdOaimmuneamountzhu)).toFixed(2);
            var sum_fmdoniu = (parseFloat(sum_fmdInactivatedimmuneamountniu) + parseFloat(sum_fmdO2immuneamountniu) + parseFloat(sum_fmdO3immuneamountniu) + parseFloat(sum_fmdOaimmuneamountniu)).toFixed(2);
            var sum_fmdosheep = (parseFloat(sum_fmdInactivatedimmuneamountsheep) +parseFloat(sum_fmdO2immuneamountsheep) + parseFloat(sum_fmdO3immuneamountsheep)+ parseFloat(sum_fmdOaimmuneamountsheep)).toFixed(2);
            var sum_fmdoother = (parseFloat(sum_fmdInactivatedimmuneamountother) + parseFloat(sum_fmdO2immuneamountother)+ parseFloat(sum_fmdO3immuneamountother)+ parseFloat(sum_fmdOaimmuneamountother)).toFixed(2);

            // 累计数量
            var lj_sum1 = (parseFloat(sum_fmdInactivatedimmuneamountpig) +parseFloat(sum_fmdInactivatedimmuneamountniu) +parseFloat(sum_fmdInactivatedimmuneamountsheep) + parseFloat(sum_fmdInactivatedimmuneamountother)).toFixed(2);
            var lj_sum2 = (parseFloat(sum_fmdO2immuneamountniu) + parseFloat(sum_fmdO2immuneamountsheep) + parseFloat(sum_fmdO2immuneamountother)).toFixed(2);
            var lj_sum3 = (parseFloat(sum_fmdO3immuneamountpig) +parseFloat(sum_fmdO3immuneamountniu) +parseFloat(sum_fmdO3immuneamountsheep) + parseFloat(sum_fmdO3immuneamountother)).toFixed(2);
            var lj_sumOa = (parseFloat(sum_fmdOaimmuneamountzhu) +parseFloat(sum_fmdOaimmuneamountniu) +parseFloat(sum_fmdOaimmuneamountsheep) + parseFloat(sum_fmdOaimmuneamountother)).toFixed(2);
            var lj_sum4 = (parseFloat(sum_fmdAimmuneamountzhu) +parseFloat(sum_fmdAimmuneamountniu) +parseFloat(sum_fmdAimmuneamountsheep) + parseFloat(sum_fmdAimmuneamountother)).toFixed(2);

            var lj_fmdosum = (parseFloat(lj_sum1) + parseFloat(lj_sum2) + parseFloat(lj_sum3)+ parseFloat(lj_sumOa)).toFixed(2);


           var sum_fmdazhu = (parseFloat(sum_fmdAimmuneamountzhu) + parseFloat(sum_fmdO3immuneamountpig)+ parseFloat(sum_fmdOaimmuneamountzhu)).toFixed(2);
            var sum_fmdaniu = (parseFloat(sum_fmdAimmuneamountniu) + parseFloat(sum_fmdO3immuneamountniu) + parseFloat(sum_fmdOaimmuneamountniu)).toFixed(2);
            var sum_fmdasheep = (parseFloat(sum_fmdAimmuneamountsheep)  + parseFloat(sum_fmdO3immuneamountsheep)+ parseFloat(sum_fmdOaimmuneamountsheep)).toFixed(2);
            var sum_fmdaother = (parseFloat(sum_fmdAimmuneamountother) + parseFloat(sum_fmdO3immuneamountother)+ parseFloat(sum_fmdOaimmuneamountother)).toFixed(2);
            var sum_fmdao = (parseFloat(sum_fmdazhu) + parseFloat(sum_fmdaniu)+ parseFloat(sum_fmdasheep)+ parseFloat(sum_fmdaother)).toFixed(2);



            var jz_fmdopig = parseFloat(immunefmdpig) == parseFloat(0) ? 0 : (parseFloat(sum_fmdozhu * 100) / parseFloat(immunefmdpig)).toFixed(2);
            var jz_fmdoother = parseFloat(immunefmdother) == parseFloat(0) ? 0 : (parseFloat(sum_fmdoother * 100) / parseFloat(immunefmdother)).toFixed(2);
            var jz_fmdoniu = parseFloat(immunefmdniu) == parseFloat(0) ? 0 : (parseFloat(sum_fmdoniu * 100) / parseFloat(immunefmdniu)).toFixed(2);
            var jz_fmdosheep = parseFloat(immunefmdsheep) == parseFloat(0) ? 0 : (parseFloat(sum_fmdosheep * 100) / parseFloat(immunefmdsheep)).toFixed(2);
            var jz_fmdosum = parseFloat(immunefmdoSum) == parseFloat(0) ? 0 : (parseFloat(lj_fmdosum * 100) / parseFloat(immunefmdoSum)).toFixed(2);
            var jz_sum2 = parseFloat(immunefmdaSum) == parseFloat(0) ? 0 : (parseFloat(sum_fmdao * 100) / parseFloat(immunefmdaSum)).toFixed(2);
            var jz_fmdazhu = parseFloat(immuneafmdzhu) == parseFloat(0) ? 0 : (parseFloat(sum_fmdazhu * 100) / parseFloat(immuneafmdzhu)).toFixed(2);
            var jz_fmdaniu = parseFloat(immuneafmdniu) == parseFloat(0) ? 0 : (parseFloat(sum_fmdaniu * 100) / parseFloat(immuneafmdniu)).toFixed(2);
            var jz_fmdasheep = parseFloat(immuneafmdsheep) == parseFloat(0) ? 0 : (parseFloat(sum_fmdasheep * 100) / parseFloat(immuneafmdsheep)).toFixed(2);
            var jz_fmdaother = parseFloat(immuneafmdsheep) == parseFloat(0) ? 0 : (parseFloat(sum_fmdaother * 100) / parseFloat(immuneafmdother)).toFixed(2);



            // 赋值

            $('td[n="immunefmdoSum"]').text(immunefmdoSum);
            $('td[n="immunefmdaSum"]').text(immunefmdaSum);

            $('td[n="lj_fmdosum"]').text(lj_fmdosum + "%");

            $("td[role=lj_fmdInactivatedvaccine]").text(sum_fmdInactivatedvaccine);
            $("td[role=lj_fmdO2vaccine]").text(sum_fmdO2vaccine);
            $("td[role=lj_fmdO3vaccine]").text(sum_fmdO3vaccine);
            $("td[role=lj_fmdOavaccine]").text(sum_fmdOavaccine);
            $("td[role=lj_fmdAvaccine]").text(sum_fmdAvaccine);

            $("td[role=lj_fmdInactivatedimmuneamountpig]").text(sum_fmdInactivatedimmuneamountpig);
            $("td[role=lj_fmdInactivatedimmuneamountniu]").text(sum_fmdInactivatedimmuneamountniu);
            $("td[role=lj_fmdInactivatedimmuneamountsheep]").text(sum_fmdInactivatedimmuneamountsheep);
            $("td[role=lj_fmdInactivatedimmuneamountother]").text(sum_fmdInactivatedimmuneamountother);


            $("td[role=lj_fmdO2immuneamountniu]").text(sum_fmdO2immuneamountniu);
            $("td[role=lj_fmdO2immuneamountsheep]").text(sum_fmdO2immuneamountsheep);
            $("td[role=lj_fmdO2immuneamountother]").text(sum_fmdO2immuneamountother);

            $("td[role=lj_fmdO3immuneamountpig]").text(sum_fmdO3immuneamountpig);
            $("td[role=lj_fmdO3immuneamountniu]").text(sum_fmdO3immuneamountniu);
            $("td[role=lj_fmdO3immuneamountsheep]").text(sum_fmdO3immuneamountsheep);
            $("td[role=lj_fmdO3immuneamountother]").text(sum_fmdO3immuneamountother);

            $("td[role=lj_fmdOaimmuneamountzhu]").text(sum_fmdOaimmuneamountzhu);
            $("td[role=lj_fmdOaimmuneamountniu]").text(sum_fmdOaimmuneamountniu);
            $("td[role=lj_fmdOaimmuneamountsheep]").text(sum_fmdOaimmuneamountsheep);
            $("td[role=lj_fmdOaimmuneamountother]").text(sum_fmdOaimmuneamountother);

            $("td[role=lj_fmdAimmuneamountzhu]").text(sum_fmdAimmuneamountzhu);
            $("td[role=lj_fmdAimmuneamountniu]").text(sum_fmdAimmuneamountniu);
            $("td[role=lj_fmdAimmuneamountsheep]").text(sum_fmdAimmuneamountsheep);
            $("td[role=lj_fmdAimmuneamountother]").text(sum_fmdAimmuneamountother);


            $("td[role=lj_sum1]").text(lj_sum1);
            $("td[role=lj_sum2]").text(lj_sum2);
            $("td[role=lj_sum3]").text(lj_sum3);
            $("td[role=lj_sumOa]").text(lj_sumOa);
            $("td[role=lj_sum4]").text(lj_sum4);

            $('td[n="jz_fmdopig"]').text(jz_fmdopig + "%");
            $('td[n="jz_fmdoniu"]').text(jz_fmdoniu + "%");
            $('td[n="jz_fmdosheep"]').text(jz_fmdosheep + "%");
            $('td[n="jz_fmdoother"]').text(jz_fmdoother + "%");
            $('td[n="jz_fmdosum"]').text(jz_fmdosum + "%");

            $('td[n="jz_sum2"]').text(jz_sum2 + "%");

            $('td[n="jz_fmdazhu"]').text(jz_fmdazhu + "%");
            $('td[n="jz_fmdaniu"]').text(jz_fmdaniu + "%");
            $('td[n="jz_fmdasheep"]').text(jz_fmdasheep + "%");
            $('td[n="jz_fmdaother"]').text(jz_fmdaother + "%");

            var flag = "true";
            var msg = "";
            if (immunefmdpig < sum_fmdozhu) {
                flag = "false";
                msg = "口蹄疫O型猪的累计免疫数量大于应免数量，请确认！";
            }
            if (immunefmdother < sum_fmdoother) {
                flag = "false";
                msg = "口蹄疫O型其他动物的累计免疫数量大于应免数量，请确认！";
            }
            if (immunefmdniu < sum_fmdoniu) {
                flag = "false";
                msg = "口蹄疫O型牛的累计免疫数量大于应免数量，请确认！";
            }
            if (immunefmdsheep < sum_fmdosheep) {
                flag = "false";
                msg = "口蹄疫O型羊的累计免疫数量大于应免数量，请确认！";
            }
            if (immuneafmdzhu < sum_fmdAimmuneamountzhu) {
                flag = "false";
                msg = "口蹄疫A型猪的累计免疫数量大于应免数量，请确认！";
            }
            if (immuneafmdniu < sum_fmdAimmuneamountniu) {
                flag = "false";
                msg = "口蹄疫A型牛的累计免疫数量大于应免数量，请确认！";
            }
            if (immuneafmdsheep < sum_fmdAimmuneamountsheep) {
                flag = "false";
                msg = "口蹄疫A型羊的累计免疫数量大于应免数量，请确认！";
            }
            if (immuneafmdother < sum_fmdAimmuneamountother) {
                flag = "false";
                msg = "口蹄疫A型其他动物的累计免疫数量大于应免数量，请确认！";
            }
            $("#valid").val(flag);
            $("#valid-msg").val(msg);


        }

        calculate()
    })(jQuery, window, document)
</script>
