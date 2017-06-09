<style type="text/css">
    .t1 {
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
        text-align: left;
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
        text-align: left;
        border-top: thin solid black;
        border-right: thin solid black;
        border-bottom: thin solid black;
        border-left: thin solid black;
        font-weight: bold;
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
        text-align: left;
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
        text-align: left;
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
        <td class="c2" colspan="21">${org.orgName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">填表日期</td>
        <td class="c2" colspan="21"><#if item.fmdDate??>${item.fmdDate?string("yyyy-MM-dd")}</#if></td>
    </tr>
    <tr class="r2">
        <td class="c2">填 表 人</td>
        <td class="c2" colspan="21">${user.realName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">主管领导</td>
        <td class="c2" colspan="21">${user.leaderName}</td>
    </tr>
    <tr class="r3">
        <td class="c2" rowspan="2">疫苗种类</td>
        <td class="c2" rowspan="2">本周疫苗使用数量(万毫升)</td>
        <td class="c3" rowspan="2">累计疫苗使用数量(万毫升)</td>
        <td class="c2" colspan="4">本周免疫数量（万头/只）</td>
        <td class="c2" colspan="5">累计免疫数量(万头/只)</td>
        <td class="c4" colspan="5">应免数量(万头/只)</td>
        <td class="c5" colspan="5">免疫进展(%)</td>
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
        <td class="c4">猪</td>
        <td class="c4">牛</td>
        <td class="c4">羊</td>
        <td class="c4">其它动物</td>
        <td class="c4">合计</td>
        <td class="c5">猪</td>
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <td class="c2">其它动物</td>
        <td class="c2">合计</td>
    </tr>
    <tr class="r5">
        <td class="c2">口蹄疫O型灭活类疫苗</td>
        <td role="data" n="fmdInactivatedvaccine" class="c2"><#if item.fmdInactivatedvaccine??>${item.fmdInactivatedvaccine}</#if></td>
        <td role="lj_fmdInactivatedvaccine" class="c7"><#if itemSum.fmdInactivatedvaccine??>${itemSum.fmdInactivatedvaccine} </#if></td>
        <td role="data" n="fmdInactivatedimmuneamountpig" class="c2"><#if item.fmdInactivatedimmuneamountpig??>${item.fmdInactivatedimmuneamountpig}</#if></td>
        <td class="c2">-</td>
        <td class="c2">-</td>
        <td role="data" n="fmdInactivatedimmuneamountother" class="c2"><#if item.fmdInactivatedimmuneamountother??>${item.fmdInactivatedimmuneamountother}</#if></td>
        <td role="lj_fmdInactivatedimmuneamountpig" class="c7"><#if itemSum.fmdInactivatedimmuneamountpig??>${itemSum.fmdInactivatedimmuneamountpig}</#if></td>
        <td class="c2">-</td>
        <td class="c2">-</td>
        <td role="lj_fmdInactivatedimmuneamountother" class="c7"><#if itemSum.fmdInactivatedimmuneamountother??>${itemSum.fmdInactivatedimmuneamountother}</#if></td>
        <td role="lj_sum1" class="c8"><#if itemSum??>${itemSum.fmdInactivatedimmuneamountother?default(0)+itemSum.fmdInactivatedimmuneamountpig?default(0)}</#if></td>
        <td n="immunefmdpig" class="c8"><#if wlivestockinout.immunefmdpig??>${wlivestockinout.immunefmdpig}</#if></td>
        <td class="c4">-</td>
        <td class="c4">-</td>
        <td n="immunefmdother" class="c9"  rowspan="2"><#if wlivestockinout.immunefmdother??>${wlivestockinout.immunefmdother}</#if></td>
        <td n="immunefmdoSum" class="c9" rowspan="3"><#if wlivestockinout??>${wlivestockinout.immunefmdpig?default(0)+wlivestockinout.immunefmdniu?default(0)+wlivestockinout.immunefmdsheep?default(0)+wlivestockinout.immunefmdother?default(0)}</#if></td>
        <td n="jz_fmdopig" class="c10"></td>
        <td class="c2">-</td>
        <td class="c2">-</td>
        <td n="jz_fmdoother" class="c8" rowspan="2"></td>
        <td n="jz_fmdosum" class="c7" rowspan="3"></td>

    </tr>
    <input id="fmdInactivatedvaccine" type="hidden" value="${itemSum.fmdInactivatedvaccine?default(0)-item.fmdInactivatedvaccine?default(0)}"/>
    <input id="fmdInactivatedimmuneamountpig" type="hidden" value="${itemSum.fmdInactivatedimmuneamountpig?default(0)-item.fmdInactivatedimmuneamountpig?default(0)}"/>
    <input id="fmdInactivatedimmuneamountother" type="hidden" value="${itemSum.fmdInactivatedimmuneamountother?default(0)-item.fmdInactivatedimmuneamountother?default(0)}"/>
    <tr class="r5">
        <td class="c2">口蹄疫O型-亚洲I型二价灭活疫苗</td>
        <td role="data" n="fmdO2vaccine" class="c2"><#if item.fmdO2vaccine??>${item.fmdO2vaccine}</#if></td>
        <td role="lj_fmdO2vaccine" class="c7"><#if itemSum.fmdO2vaccine??>${itemSum.fmdO2vaccine}</#if></td>
        <td class="c2">-</td>
        <td role="data" n="fmdO2immuneamountniu" class="c2"><#if item.fmdO2immuneamountniu??>${item.fmdO2immuneamountniu}</#if></td>
        <td role="data" n="fmdO2immuneamountsheep" class="c2"><#if item.fmdO2immuneamountsheep??>${item.fmdO2immuneamountsheep}</#if></td>
        <td role="data" n="fmdO2immuneamountother" class="c2"><#if item.fmdO2immuneamountother??>${item.fmdO2immuneamountother}</#if></td>
        <td class="c2">-</td>
        <td role="lj_fmdO2immuneamountniu" class="c7"><#if itemSum.fmdO2immuneamountniu??>${itemSum.fmdO2immuneamountniu}</#if></td>
        <td role="lj_fmdO2immuneamountsheep" class="c7"><#if itemSum.fmdO2immuneamountsheep??>${itemSum.fmdO2immuneamountsheep}</#if></td>
        <td role="lj_fmdO2immuneamountother" class="c7"><#if itemSum.fmdO2immuneamountother??>${itemSum.fmdO2immuneamountother}</#if></td>
        <td role="lj_sum2" class="c8"><#if itemSum??>${itemSum.fmdO2immuneamountniu?default(0)+itemSum.fmdO2immuneamountsheep?default(0)+itemSum.fmdO2immuneamountother?default(0)}</#if></td>
        <td class="c4">-</td>
        <td n="immunefmdniu" class="c9" rowspan="2"><#if wlivestockinout.immunefmdniu??>${wlivestockinout.immunefmdniu}</#if></td>
        <td n="immunefmdsheep" class="c9" rowspan="2"><#if wlivestockinout.immunefmdsheep??>${wlivestockinout.immunefmdsheep}</#if></td>
        <td class="c5">-</td>
        <td n="jz_fmdo2niu" class="c8" rowspan="2"></td>
        <td n="jz_fmdo2sheep" class="c7" rowspan="2"></td>
    </tr>
    <input id="fmdO2vaccine" type="hidden" value="${itemSum.fmdO2vaccine?default(0)-item.fmdO2vaccine?default(0)}"/>
    <input id="fmdO2immuneamountniu" type="hidden" value="${itemSum.fmdO2immuneamountniu?default(0)-item.fmdO2immuneamountniu?default(0)}"/>
    <input id="fmdO2immuneamountsheep" type="hidden" value="${itemSum.fmdO2immuneamountsheep?default(0)-item.fmdO2immuneamountsheep?default(0)}"/>
    <input id="fmdO2immuneamountother" type="hidden" value="${itemSum.fmdO2immuneamountother?default(0)-item.fmdO2immuneamountother?default(0)}"/>

    <tr class="r5">
        <td class="c2">口蹄疫O型-A型-亚洲I型三价灭活疫苗</td>
        <td role="data" n="fmdO3vaccine" class="c2">${item.fmdO3vaccine}</td>
        <td role="lj_fmdO3vaccine" class="c7"><#if itemSum.fmdO3vaccine??>${itemSum.fmdO3vaccine}</#if></td>
        <td class="c2">-</td>
        <td role="data" n="fmdO3immuneamountniu" class="c2">${item.fmdO3immuneamountniu}</td>
        <td role="data" n="fmdO3immuneamountsheep" class="c12">${item.fmdO3immuneamountsheep}</td>
        <td class="c13">-</td>
        <td class="c14">-</td>
        <td role="lj_fmdO3immuneamountniu" class="c7"><#if itemSum.fmdO3immuneamountniu??>${itemSum.fmdO3immuneamountniu}</#if></td>
        <td role="lj_fmdO3immuneamountsheep" class="c7"><#if itemSum.fmdO3immuneamountsheep??>${itemSum.fmdO3immuneamountsheep}</#if></td>
        <td class="c12">-</td>
        <td role="lj_sum3" class="c8"><#if itemSum??>${itemSum.fmdO3immuneamountsheep?default(0)+itemSum.fmdO3immuneamountniu?default(0)}</#if></td>
        <td class="c15">-</td>
        <td class="c16">-</td>
        <td class="c12">-</td>
        <td class="c13">-</td>
    </tr>
    <input id="fmdO3vaccine" type="hidden" value="${itemSum.fmdO3vaccine?default(0)-item.fmdO3vaccine?default(0)}"/>
    <input id="fmdO3immuneamountniu" type="hidden" value="${itemSum.fmdO3immuneamountniu?default(0)-item.fmdO3immuneamountniu?default(0)}"/>
    <input id="fmdO3immuneamountsheep" type="hidden" value="${itemSum.fmdO3immuneamountsheep?default(0)-item.fmdO3immuneamountsheep?default(0)}"/>
    <tr class="r6">
        <td class="c18">口蹄疫A型灭活疫苗</td>
        <td role="data" n="fmdAvaccine" class="c2">${item.fmdAvaccine}</td>
        <td role="lj_fmdAvaccine" class="c7"><#if itemSum.fmdAvaccine??>${itemSum.fmdAvaccine}</#if></td>

        <td class="c2">-</td>
        <td role="data" n="fmdAimmuneamountniu" class="c2">${item.fmdAimmuneamountniu}</td>
        <td role="data" n="fmdAimmuneamountsheep" class="c2">${item.fmdAimmuneamountsheep}</td>
        <td class="c2">-</td>
        <td class="c2">-</td>
        <td role="lj_fmdAimmuneamountniu" class="c7"><#if itemSum.fmdAimmuneamountniu??>${itemSum.fmdAimmuneamountniu}</#if></td>
        <td role="lj_fmdAimmuneamountsheep" class="c7"><#if itemSum.fmdAimmuneamountsheep??>${itemSum.fmdAimmuneamountsheep}</#if></td>
        <td class="c2">-</td>
        <td role="lj_sum4" class="c8"><#if itemSum??>${itemSum.fmdAimmuneamountsheep?default(0)+itemSum.fmdAimmuneamountniu?default(0)}</#if></td>
        <td class="c4">-</td>
        <td n="immuneafmdniu" class="c9"><#if wlivestockinout.immuneafmdniu??>${wlivestockinout.immuneafmdniu}</#if></td>
        <td n="immuneafmdsheep" class="c9"><#if wlivestockinout.immuneafmdsheep??>${wlivestockinout.immuneafmdsheep}</#if></td>
        <td class="c4">-</td>
        <td n="immunefmdaSum" class="c9"><#if wlivestockinout??>${wlivestockinout.immuneafmdniu?default(0)+wlivestockinout.immuneafmdsheep?default(0)}</#if></td>
        <td class="c5">-</td>
        <td n="jz_fmdaniu" class="c7"></td>
        <td n="jz_fmdasheep" class="c7"></td>
        <td class="c2">-</td>
        <td n="jz_sum2" class="c7"></td>
    </tr>
    <input id="fmdAvaccine" type="hidden" value="${itemSum.fmdAvaccine?default(0)-item.fmdAvaccine?default(0)}"/>
    <input id="fmdAimmuneamountniu" type="hidden" value="${itemSum.fmdAimmuneamountniu?default(0)-item.fmdAimmuneamountniu?default(0)}"/>
    <input id="fmdAimmuneamountsheep" type="hidden" value="${itemSum.fmdAimmuneamountsheep?default(0)-item.fmdAimmuneamountsheep?default(0)}"/>
    <tr class="r3">
        <td class="c2" rowspan="4">填表说明：</td>
        <td class="c2" colspan="21">1.本周免疫数量是指填报本周的免疫数量；</td>
    </tr>
    <tr class="r3">
        <td class="c2" colspan="21">2.使用疫苗种类与其使用数量、免疫动物数量相对应；</td>
    </tr>
    <tr class="r3">
        <td class="c2" colspan="21">3.没有数字填报，请填&ldquo;0&rdquo;；</td>
    </tr>
    <tr class="r3">
        <td class="c2" colspan="21">4.填报数字请保留至小数点后2位。</td>
    </tr>
    </tbody>
</table>
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
                var input = $('<input style="height: 100%;width:100%;" type="text" name="' + n + '" value="' + oldText + '">')
                input.on("blur", function (e) {
                    var v = $(this).val()
                    $(this).parent("td").html(v)
                    calculate()
                })
                input.on("click", function (e) {
                    e.stopPropagation()
                })
                $(this).append(input);
                input.focus()
                e.stopPropagation()
            })
        })

        var calculate = function () {
            var immunefmdpig = $.trim($('td[n="immunefmdpig"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="immunefmdpig"]').text()));
            var immunefmdother = $.trim($('td[n="immunefmdother"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="immunefmdother"]').text()));
            var fmdInactivatedvaccine = $.trim($('td[n="fmdInactivatedvaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdInactivatedvaccine"]').text()));
            var fmdInactivatedimmuneamountpig = $.trim($('td[n="fmdInactivatedimmuneamountpig"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdInactivatedimmuneamountpig"]').text()));
            var fmdInactivatedimmuneamountother = $.trim($('td[n="fmdInactivatedimmuneamountother"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdInactivatedimmuneamountother"]').text()));
            var lj_fmdInactivatedvaccine=document.getElementById('fmdInactivatedvaccine').value;
            var lj_fmdInactivatedimmuneamountpig=document.getElementById('fmdInactivatedimmuneamountpig').value;
            var lj_fmdInactivatedimmuneamountother=document.getElementById('fmdInactivatedimmuneamountother').value;
            var sum_fmdInactivatedvaccine=(parseFloat(lj_fmdInactivatedvaccine)+parseFloat(fmdInactivatedvaccine)).toFixed(2);
            var sum_fmdInactivatedimmuneamountpig=(parseFloat(lj_fmdInactivatedimmuneamountpig)+parseFloat(fmdInactivatedimmuneamountpig)).toFixed(2);
            var sum_fmdInactivatedimmuneamountother=(parseFloat(lj_fmdInactivatedimmuneamountother)+parseFloat(fmdInactivatedimmuneamountother)).toFixed(2);
            var lj_sum1=(parseFloat(sum_fmdInactivatedimmuneamountpig)+parseFloat(sum_fmdInactivatedimmuneamountother)).toFixed(2);
            var jz_fmdopig=parseFloat(immunefmdpig)==parseFloat(0)?0:(parseFloat(sum_fmdInactivatedimmuneamountpig*100)/parseFloat(immunefmdpig)).toFixed(2);
            $("td[role=lj_fmdInactivatedvaccine]").text(sum_fmdInactivatedvaccine);
            $("td[role=lj_fmdInactivatedimmuneamountpig]").text(sum_fmdInactivatedimmuneamountpig);
            $("td[role=lj_fmdInactivatedimmuneamountother]").text(sum_fmdInactivatedimmuneamountother);
            $("td[role=lj_sum1]").text(lj_sum1);
            $('td[n="jz_fmdopig"]').text(jz_fmdopig+"%");

            var immunefmdniu = $.trim($('td[n="immunefmdniu"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="immunefmdniu"]').text()));
            var immunefmdsheep = $.trim($('td[n="immunefmdsheep"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="immunefmdsheep"]').text()));
            var immunefmdoSum=(parseFloat(immunefmdpig)+parseFloat(immunefmdniu)+parseFloat(immunefmdsheep)+parseFloat(immunefmdother)).toFixed(2);
            $('td[n="immunefmdoSum"]').text(immunefmdoSum);
            var fmdO2immuneamountniu = $.trim($('td[n="fmdO2immuneamountniu"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdO2immuneamountniu"]').text()));
            var fmdO2immuneamountsheep = $.trim($('td[n="fmdO2immuneamountsheep"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdO2immuneamountsheep"]').text()));
            var fmdO2immuneamountother = $.trim($('td[n="fmdO2immuneamountother"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdO2immuneamountother"]').text()));
            var fmdO2vaccine = $.trim($('td[n="fmdO2vaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdO2vaccine"]').text()));
            var lj_fmdO2immuneamountniu=document.getElementById('fmdO2immuneamountniu').value;
            var lj_fmdO2immuneamountsheep=document.getElementById('fmdO2immuneamountsheep').value;
            var lj_fmdO2immuneamountother=document.getElementById('fmdO2immuneamountother').value;
            var lj_fmdO2vaccine=document.getElementById('fmdO2vaccine').value;
            var sum_fmdO2immuneamountniu=(parseFloat(lj_fmdO2immuneamountniu)+parseFloat(fmdO2immuneamountniu)).toFixed(2);
            var sum_fmdO2immuneamountsheep=(parseFloat(lj_fmdO2immuneamountsheep)+parseFloat(fmdO2immuneamountsheep)).toFixed(2);
            var sum_fmdO2immuneamountother=(parseFloat(lj_fmdO2immuneamountother)+parseFloat(fmdO2immuneamountother)).toFixed(2);
            var sum_fmdO2vaccine=(parseFloat(lj_fmdO2vaccine)+parseFloat(fmdO2vaccine)).toFixed(2);
            var sum_fmdoother=(parseFloat(sum_fmdInactivatedimmuneamountother)+parseFloat(sum_fmdO2immuneamountother)).toFixed(2);
            var lj_sum2=(parseFloat(sum_fmdO2immuneamountniu)+parseFloat(sum_fmdO2immuneamountsheep)+parseFloat(sum_fmdO2immuneamountother)).toFixed(2);
            $("td[role=lj_fmdO2immuneamountniu]").text(sum_fmdO2immuneamountniu);
            $("td[role=lj_fmdO2immuneamountsheep]").text(sum_fmdO2immuneamountsheep);
            $("td[role=lj_fmdO2immuneamountother]").text(sum_fmdO2immuneamountother);
            $("td[role=lj_fmdO2vaccine]").text(sum_fmdO2vaccine);
            $("td[role=lj_sum2]").text(lj_sum2);

            var jz_fmdoother=parseFloat(immunefmdother)==parseFloat(0)?0:(parseFloat(sum_fmdoother*100)/parseFloat(immunefmdother)).toFixed(2);
            $('td[n="jz_fmdoother"]').text(jz_fmdoother+"%");

            if(immunefmdpig<sum_fmdInactivatedimmuneamountpig){
                alert('口蹄疫O型猪的累计免疫数量大于应免数量，请确认！');
            }
            if(immunefmdother<sum_fmdoother){
                alert('口蹄疫O型其他动物的累计免疫数量大于应免数量，请确认！');
            }

            var fmdO3vaccine = $.trim($('td[n="fmdO3vaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdO3vaccine"]').text()));
            var fmdO3immuneamountniu = $.trim($('td[n="fmdO3immuneamountniu"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdO3immuneamountniu"]').text()));
            var fmdO3immuneamountsheep = $.trim($('td[n="fmdO3immuneamountsheep"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdO3immuneamountsheep"]').text()));
            var lj_fmdO3vaccine=document.getElementById('fmdO3vaccine').value;
            var lj_fmdO3immuneamountniu=document.getElementById('fmdO3immuneamountniu').value;
            var lj_fmdO3immuneamountsheep=document.getElementById('fmdO3immuneamountsheep').value;
            var sum_fmdO3vaccine=(parseFloat(lj_fmdO3vaccine)+parseFloat(fmdO3vaccine)).toFixed(2);
            var sum_fmdO3immuneamountniu=(parseFloat(lj_fmdO3immuneamountniu)+parseFloat(fmdO3immuneamountniu)).toFixed(2);
            var sum_fmdO3immuneamountsheep=(parseFloat(lj_fmdO3immuneamountsheep)+parseFloat(fmdO3immuneamountsheep)).toFixed(2);
            var sum_fmdoniu=(parseFloat(sum_fmdO2immuneamountniu)+parseFloat(sum_fmdO3immuneamountniu)).toFixed(2);
            var sum_fmdosheep=(parseFloat(sum_fmdO2immuneamountsheep)+parseFloat(sum_fmdO3immuneamountsheep)).toFixed(2);
            var lj_sum3=(parseFloat(sum_fmdO3immuneamountniu)+parseFloat(sum_fmdO3immuneamountsheep)).toFixed(2);
            var lj_fmdosum=(parseFloat(lj_sum1)+parseFloat(lj_sum2)+parseFloat(lj_sum3)).toFixed(2);
            $("td[role=lj_fmdO3vaccine]").text(sum_fmdO3vaccine);
            $("td[role=lj_fmdO3immuneamountniu]").text(sum_fmdO3immuneamountniu);
            $("td[role=lj_fmdO3immuneamountsheep]").text(sum_fmdO3immuneamountsheep);
            var jz_fmdo2niu=parseFloat(immunefmdniu)==parseFloat(0)?0:(parseFloat(sum_fmdoniu*100)/parseFloat(immunefmdniu)).toFixed(2);
            var jz_fmdo2sheep=parseFloat(immunefmdsheep)==parseFloat(0)?0:(parseFloat(sum_fmdosheep*100)/parseFloat(immunefmdsheep)).toFixed(2);
            var jz_fmdosum=parseFloat(immunefmdoSum)==parseFloat(0)?0:(parseFloat(lj_fmdosum*100)/parseFloat(immunefmdoSum)).toFixed(2);
            $("td[role=lj_sum3]").text(lj_sum3);
            $('td[n="jz_fmdo2niu"]').text(jz_fmdo2niu+"%");
            $('td[n="jz_fmdo2sheep"]').text(jz_fmdo2sheep+"%");
            $('td[n="lj_fmdosum"]').text(lj_fmdosum+"%");
            $('td[n="jz_fmdosum"]').text(jz_fmdosum+"%");
            if(immunefmdniu<sum_fmdoniu){
                alert('口蹄疫O型牛的累计免疫数量大于应免数量，请确认！');
            }
            if(immunefmdsheep<sum_fmdosheep){
                alert('口蹄疫O型羊的累计免疫数量大于应免数量，请确认！');
            }

            var immuneafmdniu = $.trim($('td[n="immuneafmdniu"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="immuneafmdniu"]').text()));
            var immuneafmdsheep = $.trim($('td[n="immuneafmdsheep"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="immuneafmdsheep"]').text()));
            var immunefmdaSum=(parseFloat(immuneafmdniu)+parseFloat(immuneafmdsheep)).toFixed(2);
            $('td[n="immunefmdaSum"]').text(immunefmdaSum);
            var fmdAvaccine = $.trim($('td[n="fmdAvaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdAvaccine"]').text()));
            var fmdAimmuneamountniu = $.trim($('td[n="fmdAimmuneamountniu"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdAimmuneamountniu"]').text()));
            var fmdAimmuneamountsheep = $.trim($('td[n="fmdAimmuneamountsheep"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdAimmuneamountsheep"]').text()));
            var lj_fmdAvaccine=document.getElementById('fmdAvaccine').value;
            var lj_fmdAimmuneamountniu=document.getElementById('fmdAimmuneamountniu').value;
            var lj_fmdAimmuneamountsheep=document.getElementById('fmdAimmuneamountsheep').value;
            var sum_fmdAvaccine=(parseFloat(lj_fmdAvaccine)+parseFloat(fmdAvaccine)).toFixed(2);
            var sum_fmdAimmuneamountniu=(parseFloat(lj_fmdAimmuneamountniu)+parseFloat(fmdAimmuneamountniu)).toFixed(2);
            var sum_fmdAimmuneamountsheep=(parseFloat(lj_fmdAimmuneamountsheep)+parseFloat(fmdAimmuneamountsheep)).toFixed(2);
            $("td[role=lj_fmdAvaccine]").text(sum_fmdAvaccine);
            $("td[role=lj_fmdAimmuneamountniu]").text(sum_fmdAimmuneamountniu);
            $("td[role=lj_fmdAimmuneamountsheep]").text(sum_fmdAimmuneamountsheep);
            var lj_sum4=(parseFloat(sum_fmdAimmuneamountniu)+parseFloat(sum_fmdAimmuneamountsheep)).toFixed(2);
            var jz_sum2=parseFloat(immunefmdaSum)==parseFloat(0)?0:(parseFloat(lj_sum4*100)/parseFloat(immunefmdaSum)).toFixed(2);
            $('td[n="jz_sum2"]').text(jz_sum2+"%");

            var jz_fmdaniu=parseFloat(immuneafmdniu)==parseFloat(0)?0:(parseFloat(sum_fmdAimmuneamountniu*100)/parseFloat(immuneafmdniu)).toFixed(2);
            var jz_fmdasheep=parseFloat(immuneafmdsheep)==parseFloat(0)?0:(parseFloat(sum_fmdAimmuneamountsheep*100)/parseFloat(immuneafmdsheep)).toFixed(2);
            $("td[role=lj_sum4]").text(lj_sum4);
            $('td[n="jz_fmdaniu"]').text(jz_fmdaniu+"%");
            $('td[n="jz_fmdasheep"]').text(jz_fmdasheep+"%");

            if(immuneafmdniu<sum_fmdAimmuneamountniu){
                alert('口蹄疫A型牛的累计免疫数量大于应免数量，请确认！');
            }
            if(immuneafmdsheep<sum_fmdAimmuneamountsheep){
                alert('口蹄疫A型羊的累计免疫数量大于应免数量，请确认！');
            }



        }

        calculate()
    })(jQuery, window, document)
</script>
