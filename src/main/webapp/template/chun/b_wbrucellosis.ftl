<html>
<head>
    <META http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style type="text/css">.b1 {
        white-space-collapsing: preserve;
    }

    .t1 {width:100%;
        border-collapse: collapse;
        border-spacing: 0;
    }

    .r1 {
        height: 24.75pt;
    }

    .r2 {
        height: 15.0pt;
    }

    .r3 {
        height: 16.5pt;
    }

    .r4 {
        height: 28.5pt;
    }

    .r5 {
        height: 27.75pt;
    }

    .r6 {
        height: 18.75pt;
    }

    .r7 {
        height: 14.25pt;
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
        text-align: left;
        border-top: thin solid black;
        border-right: thin solid black;
        border-bottom: thin solid black;
        border-left: thin solid black;
        color: black;
        font-size: 10pt;
    }

    .c4 {
        white-space: pre-wrap;
        text-align: center;
        background-color: #ff99cc;
        border-top: thin solid black;
        border-right: thin solid black;
        border-bottom: thin solid black;
        border-left: thin solid black;
        color: black;
        font-size: 10pt;
    }

    .c5 {
        white-space: pre-wrap;
        text-align: center;
        background-color: silver;
        border-top: thin solid black;
        border-right: thin solid black;
        border-bottom: thin solid black;
        border-left: thin solid black;
        color: black;
        font-size: 10pt;
    }

    .c6 {
        white-space: pre-wrap;
        text-align: left;
        color: black;
        font-size: 10pt;
    }
    </style>
    <meta content="lsj" name="author">
</head>
<body class="b1">
<table class="t1">
    <colgroup>
        <col width="125">
        <col width="85">
        <col width="78">
        <col width="83">
        <col width="83">
        <col width="66">
        <col width="66">
        <col width="77">
        <col width="77">
        <col width="77">
        <col width="71">
    </colgroup>
    <tbody>
    <tr class="r1">
        <td class="c1" colspan="11">${templateName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">单 位:</td>
        <td class="c3" colspan="10">${org.orgName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">填表日期:</td>
        <td class="c3" colspan="10"><#if report.reportTime??>${report.reportTime?string("yyyy-MM-dd")}</#if></td>
    </tr>
    <tr class="r3">
        <td class="c2">填 表 人:</td>
        <td class="c3" colspan="10">${user.realName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">主管领导：</td>
        <td class="c3" colspan="10">${user.leaderName}</td>
    </tr>
    <tr class="r4">
        <td class="c2" rowspan="2">疫苗种类</td>
        <td class="c2" rowspan="2">本周疫苗使用数量(万头份)</td>
        <td class="c2" rowspan="2">春防累计疫苗使用数量(万头份)</td>
        <td class="c2" colspan="2">本周免疫数量（万头）</td>
        <td class="c2" colspan="2">春防累计免疫数量(万头)</td>
        <td class="c2" colspan="2">春防应免数量(万头)</td>
        <td class="c2" colspan="2">免疫进展(%)</td>
    </tr>
    <tr class="r5">
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <td class="c2">牛</td>
        <td class="c2">羊</td>
    </tr>
    <tr class="r3">
        <td class="c2">布鲁氏菌活疫苗(S2株)</td>
        <td role="data" n="bruS2vaccineuse"  class="c2"><#if item.bruS2vaccineuse??>${item.bruS2vaccineuse}</#if></td>
        <td role="lj_bruS2vaccineuse" class="c4"><#if itemSum.bruS2vaccineuse??>${itemSum.bruS2vaccineuse} </#if></td>
        <td role="data" n="bruS2niuimmuneamount"  class="c5"><#if item.bruS2niuimmuneamount??>${item.bruS2niuimmuneamount}</#if></td>
        <td role="data" n="bruS2sheepimmuneamount" class="c5"><#if item.bruS2sheepimmuneamount??>${item.bruS2sheepimmuneamount}</#if></td>
        <td role="lj_bruS2niuimmuneamount" class="c4"><#if itemSum.bruS2niuimmuneamount??>${itemSum.bruS2niuimmuneamount} </#if></td>
        <td role="lj_bruS2sheepimmuneamount" class="c4"><#if itemSum.bruS2sheepimmuneamount??>${itemSum.bruS2sheepimmuneamount}</#if> </td>
        <td n="immuneBruniu" class="c4" rowspan="3"><#if wlivestockinout.immuneBruniu??>${wlivestockinout.immuneBruniu}</#if></td>
        <td n="immuneBruSheep" class="c4" rowspan="3"><#if wlivestockinout.immuneBruSheep??>${wlivestockinout.immuneBruSheep}</#if></td>
        <td n="jz_niu" class="c4" rowspan="3"><#if (wlivestockinout.immuneBruniu??&&wlivestockinout.immuneBruniu>0)>${(itemSum.bruS2niuimmuneamount?default(0)+itemSum.bruM5niuimmuneamount?default(0)+itemSum.bruA19niuimmuneamount?default(0))*100/wlivestockinout.immuneBruniu}%</#if></td>
        <td n="jz_sheep" class="c4" rowspan="3"><#if (wlivestockinout.immuneBruSheep??&&wlivestockinout.immuneBruSheep>0)>${(itemSum.bruS2sheepimmuneamount?default(0)+itemSum.bruM5sheepimmuneamount?default(0)+itemSum.bruA19sheepimmuneamount?default(0))*100/wlivestockinout.immuneBruSheep}%</#if></td>
        <input id="bruS2vaccineuse" type="hidden" value="${itemSum.bruS2vaccineuse?default(0)-item.bruS2vaccineuse?default(0)}"/>
        <input id="bruS2niuimmuneamount" type="hidden" value="${itemSum.bruS2niuimmuneamount?default(0)-item.bruS2niuimmuneamount?default(0)}"/>
        <input id="bruS2sheepimmuneamount" type="hidden" value="${itemSum.bruS2sheepimmuneamount?default(0)-item.bruS2sheepimmuneamount?default(0)}"/>
    </tr>
    <tr class="r3">
        <td class="c2">布鲁氏菌活疫苗(A19株)</td>
        <td role="data" n="bruA19vaccineuse"  class="c2"><#if item.bruA19vaccineuse??>${item.bruA19vaccineuse}</#if></td>
        <td role="lj_bruA19vaccineuse" class="c4"><#if itemSum.bruA19vaccineuse??>${itemSum.bruA19vaccineuse} </#if></td>
        <td role="data" n="bruA19niuimmuneamount"  class="c5"><#if item.bruA19niuimmuneamount??>${item.bruA19niuimmuneamount}</#if></td>
        <td role="data" n="bruA19sheepimmuneamount" class="c5"><#if item.bruA19sheepimmuneamount??>${item.bruA19sheepimmuneamount}</#if></td>
        <td role="lj_bruA19niuimmuneamount" class="c4"><#if itemSum.bruA19niuimmuneamount??>${itemSum.bruA19niuimmuneamount} </#if></td>
        <td role="lj_bruA19sheepimmuneamount" class="c4"><#if itemSum.bruA19sheepimmuneamount??>${itemSum.bruA19sheepimmuneamount}</#if> </td>
        <input id="bruA19vaccineuse" type="hidden" value="${itemSum.bruA19vaccineuse?default(0)-item.bruA19vaccineuse?default(0)}"/>
        <input id="bruA19niuimmuneamount" type="hidden" value="${itemSum.bruA19niuimmuneamount?default(0)-item.bruA19niuimmuneamount?default(0)}"/>
        <input id="bruA19sheepimmuneamount" type="hidden" value="${itemSum.bruA19sheepimmuneamount?default(0)-item.bruA19sheepimmuneamount?default(0)}"/>
    </tr>
    <tr class="r3">
        <td class="c2">布鲁氏菌活疫苗(M5株)</td>
        <td role="data" n="bruM5vaccineuse"  class="c2"><#if item.bruM5vaccineuse??>${item.bruM5vaccineuse}</#if></td>
        <td role="lj_bruM5vaccineuse" class="c4"><#if itemSum.bruM5vaccineuse??>${itemSum.bruM5vaccineuse} </#if></td>
        <td role="data" n="bruM5niuimmuneamount"  class="c5"><#if item.bruM5niuimmuneamount??>${item.bruM5niuimmuneamount}</#if></td>
        <td role="data" n="bruM5sheepimmuneamount" class="c5"><#if item.bruM5sheepimmuneamount??>${item.bruM5sheepimmuneamount}</#if></td>
        <td role="lj_bruM5niuimmuneamount" class="c4"><#if itemSum.bruM5niuimmuneamount??>${itemSum.bruM5niuimmuneamount} </#if></td>
        <td role="lj_bruM5sheepimmuneamount" class="c4"><#if itemSum.bruM5sheepimmuneamount??>${itemSum.bruM5sheepimmuneamount}</#if> </td>
        <input id="bruM5vaccineuse" type="hidden" value="${itemSum.bruM5vaccineuse?default(0)-item.bruM5vaccineuse?default(0)}"/>
        <input id="bruM5niuimmuneamount" type="hidden" value="${itemSum.bruM5niuimmuneamount?default(0)-item.bruM5niuimmuneamount?default(0)}"/>
        <input id="bruM5sheepimmuneamount" type="hidden" value="${itemSum.bruM5sheepimmuneamount?default(0)-item.bruM5sheepimmuneamount?default(0)}"/>
    </tr>
    <tr class="r3">
        <td class="c2" rowspan="3">填报说明：</td>
        <td class="c3" colspan="10">1.本周免疫数量是指填报本周的免疫数量；</td>
    </tr>
    <tr class="r3">
        <td class="c3" colspan="10">2.使用的疫苗种类与其使用数量、免疫动物数量相对应；</td>
    </tr>
    <tr class="r6">
        <td class="c3" colspan="10">3.未开展布鲁氏菌病免疫的省份请填"0"。</td>
    </tr>
    <tr class="r7">
        <td class="c6">&nbsp;</td>
    </tr>
    </tbody>
</table>
<input type="hidden" id="valid"/>
<input type="hidden" id="valid-msg"/>
</body>
</html>
<#if report.status!=1>
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
                input.focus();input.select();
                e.stopPropagation()
            })
        })

        var calculate = function () {
            var bruS2vaccineuse = $.trim($('td[n="bruS2vaccineuse"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="bruS2vaccineuse"]').text()));
            var bruS2niuimmuneamount = $.trim($('td[n="bruS2niuimmuneamount"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="bruS2niuimmuneamount"]').text()));
            var bruS2sheepimmuneamount = $.trim($('td[n="bruS2sheepimmuneamount"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="bruS2sheepimmuneamount"]').text()));
            var lj_bruS2vaccineuse=document.getElementById('bruS2vaccineuse').value;
            var lj_bruS2niuimmuneamount=document.getElementById('bruS2niuimmuneamount').value;
            var lj_bruS2sheepimmuneamount=document.getElementById('bruS2sheepimmuneamount').value;
            var sum_bruS2vaccineuse=(parseFloat(lj_bruS2vaccineuse)+parseFloat(bruS2vaccineuse)).toFixed(2);
            var sum_bruS2sheepimmuneamount=(parseFloat(lj_bruS2sheepimmuneamount)+parseFloat(bruS2sheepimmuneamount)).toFixed(2);
            var sum_bruS2niuimmuneamount=(parseFloat(lj_bruS2niuimmuneamount)+parseFloat(bruS2niuimmuneamount)).toFixed(2);
            $("td[role=lj_bruS2vaccineuse]").text(sum_bruS2vaccineuse);
            $("td[role=lj_bruS2sheepimmuneamount]").text(sum_bruS2sheepimmuneamount);
            $("td[role=lj_bruS2niuimmuneamount]").text(sum_bruS2niuimmuneamount);

            var bruA19vaccineuse = $.trim($('td[n="bruA19vaccineuse"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="bruA19vaccineuse"]').text()));
            var bruA19niuimmuneamount = $.trim($('td[n="bruA19niuimmuneamount"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="bruA19niuimmuneamount"]').text()));
            var bruA19sheepimmuneamount = $.trim($('td[n="bruA19sheepimmuneamount"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="bruA19sheepimmuneamount"]').text()));
            var lj_bruA19vaccineuse=document.getElementById('bruA19vaccineuse').value;
            var lj_bruA19niuimmuneamount=document.getElementById('bruA19niuimmuneamount').value;
            var lj_bruA19sheepimmuneamount=document.getElementById('bruA19sheepimmuneamount').value;

            var sum_bruA19vaccineuse=(parseFloat(lj_bruA19vaccineuse)+parseFloat(bruA19vaccineuse)).toFixed(2);
            var sum_bruA19sheepimmuneamount=(parseFloat(lj_bruA19sheepimmuneamount)+parseFloat(bruA19sheepimmuneamount)).toFixed(2);
            var sum_bruA19niuimmuneamount=(parseFloat(lj_bruA19niuimmuneamount)+parseFloat(bruA19niuimmuneamount)).toFixed(2);
            $("td[role=lj_bruA19vaccineuse]").text(sum_bruA19vaccineuse);
            $("td[role=lj_bruA19sheepimmuneamount]").text(sum_bruA19sheepimmuneamount);
            $("td[role=lj_bruA19niuimmuneamount]").text(sum_bruA19niuimmuneamount);

            var bruM5vaccineuse = $.trim($('td[n="bruM5vaccineuse"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="bruM5vaccineuse"]').text()));
            var bruM5niuimmuneamount = $.trim($('td[n="bruM5niuimmuneamount"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="bruM5niuimmuneamount"]').text()));
            var bruM5sheepimmuneamount = $.trim($('td[n="bruM5sheepimmuneamount"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="bruM5sheepimmuneamount"]').text()));
            var lj_bruM5vaccineuse=document.getElementById('bruM5vaccineuse').value;
            var lj_bruM5niuimmuneamount=document.getElementById('bruM5niuimmuneamount').value;
            var lj_bruM5sheepimmuneamount=document.getElementById('bruM5sheepimmuneamount').value;

            var sum_bruM5vaccineuse=(parseFloat(lj_bruM5vaccineuse)+parseFloat(bruM5vaccineuse)).toFixed(2);
            var sum_bruM5sheepimmuneamount=(parseFloat(lj_bruM5sheepimmuneamount)+parseFloat(bruM5sheepimmuneamount)).toFixed(2);
            var sum_bruM5niuimmuneamount=(parseFloat(lj_bruM5niuimmuneamount)+parseFloat(bruM5niuimmuneamount)).toFixed(2);
            $("td[role=lj_bruM5vaccineuse]").text(sum_bruM5vaccineuse);
            $("td[role=lj_bruM5sheepimmuneamount]").text(sum_bruM5sheepimmuneamount);
            $("td[role=lj_bruM5niuimmuneamount]").text(sum_bruM5niuimmuneamount);

            var lj_niu=(parseFloat(sum_bruS2niuimmuneamount)+parseFloat(sum_bruM5niuimmuneamount)+parseFloat(sum_bruA19niuimmuneamount)).toFixed(2);
            var lj_sheep=(parseFloat(sum_bruS2sheepimmuneamount)+parseFloat(sum_bruM5sheepimmuneamount)+parseFloat(sum_bruA19sheepimmuneamount)).toFixed(2);
            var immuneBruniu = $.trim($('td[n="immuneBruniu"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="immuneBruniu"]').text()));
            var immuneBruSheep = $.trim($('td[n="immuneBruSheep"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="immuneBruSheep"]').text()));
            var jz_niu=parseFloat(immuneBruniu)==parseFloat(0)?0:(parseFloat(lj_niu*100)/parseFloat(immuneBruniu)).toFixed(2);
            var jz_sheep=parseFloat(immuneBruSheep)==parseFloat(0)?0:(parseFloat(lj_sheep*100)/parseFloat(immuneBruSheep)).toFixed(2);
            $('td[n="jz_niu"]').text(jz_niu+"%");
            $('td[n="jz_sheep"]').text(jz_sheep+"%");

            var flag="true";
            var msg="";
            if(immuneBruniu<lj_niu){
                flag="false";
                msg="累牛的累计免疫数量大于应免数量，请确认！";
            }
            if(immuneBruSheep<lj_sheep){
                flag="false";
                msg="羊的累计免疫数量大于应免数量，请确认！";
            }

            $("#valid").val(flag);
            $("#valid-msg").val(msg);
        }

        calculate()
    })(jQuery, window, document)
</script>
</#if>
