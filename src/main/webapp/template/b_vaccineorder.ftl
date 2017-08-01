<html>
<head>
    <META http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style type="text/css">
        .b1 {
            white-space-collapsing: preserve;
        }

        .t1 {
            width: 100%;
            border-collapse: collapse;
            border-spacing: 0;
        }

        .r1 {
            height: 19.5pt;
        }

        .r2 {
            height: 21.95pt;
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
            text-align: center;
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
            color: black;
            font-size: 10pt;
        }

        .c5 {
            white-space: pre-wrap;
            text-align: center;
            border-top: thin solid black;
            border-bottom: thin solid black;
            border-left: thin solid black;
            color: black;
            font-size: 10pt;
        }

        .c6 {
            white-space: pre-wrap;
            text-align: center;
            background-color: #ffc0c0;
            border-top: thin solid black;
            border-right: thin solid black;
            border-bottom: thin solid black;
            border-left: thin solid black;
            color: black;
            font-size: 10pt;
        }

        .c7 {
            white-space: pre-wrap;
            text-align: right;
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
            border-top: thin solid black;
            border-right: thin solid black;
            border-left: thin solid black;
            color: black;
            font-size: 10pt;
        }

        .c9 {
            white-space: pre-wrap;
            text-align: center;
            border-top: thin solid black;
            border-right: thin solid black;
            border-left: thin solid black;
            color: black;
            font-size: 10pt;
        }

        .c10 {
            white-space: pre-wrap;
            text-align: left;
            border-top: thin solid black;
            border-bottom: thin solid black;
            border-left: thin solid black;
            color: black;
            font-size: 10pt;
        }

        .c11 {
            white-space: pre-wrap;
            text-align: left;
            border-right: thin solid black;
            border-bottom: thin solid black;
            border-left: thin solid black;
            color: black;
            font-size: 10pt;
        }

        .c12 {
            white-space: pre-wrap;
            text-align: center;
            border-right: thin solid black;
            border-bottom: thin solid black;
            border-left: thin solid black;
            color: black;
            font-size: 10pt;
        }

        .c13 {
            white-space: pre-wrap;
            font-size: 10pt;
        }
    </style>
</head>
<body class="b1">

<table class="t1">
    <colgroup>
        <col width="129">
        <col width="412">
        <col width="110">
        <col width="110">
        <col width="110">
        <col width="110">
        <col width="91">
        <col width="92">
        <col width="64">
    </colgroup>
    <tbody>
    <tr class="r1">
        <td class="c1" colspan="6">${templateName}</td>

    </tr>
    <tr class="r1">
        <td class="c3">单 位:</td>
        <td class="c2" colspan="5">${org.orgName}</td>

    </tr>
    <tr class="r1">
        <td class="c3">填表日期:</td>
        <td class="c2" colspan="5"><#if item.date??>${item.date?string("yyyy-MM-dd")}</#if></td>

    </tr>
    <tr class="r1">
        <td class="c3">填 表 人:</td>
        <td class="c2" colspan="5">${user.realName}</td>

    </tr>
    <tr class="r1">
        <td class="c3">主管领导：</td>
        <td class="c2" colspan="5">${user.leaderName}</td>

    </tr>
    <tr class="r1">
        <td class="c3" colspan="2">疫苗种类</td>
        <td class="c3">本月到货</td>
        <td class="c3">累计到货</td>
        <td class="c3">本月下拨</td>
        <td class="c3">累计下拨</td>
        

    </tr>
    <tr class="r1">
        <td class="c5" rowspan="6">口蹄疫</td>
        <td class="c2">口蹄疫O型灭活类疫苗(万毫升)</td>
        <td role="data" n="evFmoinactivateddh"
            class="c3"><#if item.evFmoinactivateddh??>${item.evFmoinactivateddh}</#if></td>
        <td role="lj_evFmoinactivateddh"
            class="c6"><#if itemSum??&&itemSum.evFmoinactivateddh??>${itemSum.evFmoinactivateddh}</#if></td>
        <td role="data" n="evFmoinactivatedx"
            class="c3"><#if item.evFmoinactivatedx??>${item.evFmoinactivatedx}</#if></td>
        <td role="lj_evFmoinactivatedx"
            class="c6"><#if itemSum??&&itemSum.evFmoinactivatedx??>${itemSum.evFmoinactivatedx}</#if></td>
        

    </tr>
    <tr class="r1">
        <td class="c2">口蹄疫O型合成肽疫苗（万毫升）</td>
        <td role="data" n="evFmosyntheticdh" class="c3"><#if item.evFmosyntheticdh??>${item.evFmosyntheticdh}</#if></td>
        <td role="lj_evFmosyntheticdh"
            class="c6"><#if itemSum??&&itemSum.evFmosyntheticdh??>${itemSum.evFmosyntheticdh}</#if></td>
        <td role="data" n="evFmosyntheticx" class="c3"><#if item.evFmosyntheticx??>${item.evFmosyntheticx}</#if></td>
        <td role="lj_evFmosyntheticx"
            class="c6"><#if itemSum??&&itemSum.evFmosyntheticx??>${itemSum.evFmosyntheticx}</#if></td>
      
    </tr>
    <input id="evFmoinactivateddh" type="hidden"
           value="${itemSum.evFmoinactivateddh?default(0)-item.evFmoinactivateddh?default(0)}"/>
    <input id="evFmoinactivatedx" type="hidden"
           value="${itemSum.evFmoinactivatedx?default(0)-item.evFmoinactivatedx?default(0)}"/>
    <input id="evFmosyntheticdh" type="hidden"
           value="${itemSum.evFmosyntheticdh?default(0)-item.evFmosyntheticdh?default(0)}"/>
    <input id="evFmosyntheticx" type="hidden"
           value="${itemSum.evFmosyntheticx?default(0)-item.evFmosyntheticx?default(0)}"/>
    <tr class="r1">
        <td class="c2">口蹄疫O型-亚洲I型二价灭活疫苗(万毫升)</td>
        <td role="data" n="evFmosinactivateddh"
            class="c3"><#if item.evFmosinactivateddh??>${item.evFmosinactivateddh}</#if></td>
        <td role="lj_evFmosinactivateddh"
            class="c6"><#if itemSum??&&itemSum.evFmosinactivateddh??>${itemSum.evFmosinactivateddh}</#if></td>
        <td role="data" n="evFmosinactivatedx"
            class="c3"><#if item.evFmosinactivatedx??>${item.evFmosinactivatedx}</#if></td>
        <td role="lj_evFmosinactivatedx"
            class="c6"><#if itemSum??&&itemSum.evFmosinactivatedx??>${itemSum.evFmosinactivatedx}</#if></td>
       

    </tr>
    <tr class="r1">
        <td class="c8">口蹄疫O型-A型二价灭活疫苗（万毫升）</td>
        <td role="data" n="evFmoasdh" class="c9"><#if item.evFmoasdh??>${item.evFmoasdh}</#if></td>
        <td role="lj_evFmoasdh" class="c6"><#if itemSum??&&itemSum.evFmoasdh??>${itemSum.evFmoasdh}</#if></td>
        <td role="data" n="evFmoasx" class="c9"><#if item.evFmoasx??>${item.evFmoasx}</#if></td>
        <td role="lj_evFmoasx" class="c6"><#if itemSum??&&itemSum.evFmoasx??>${itemSum.evFmoasx}</#if></td>
        
    </tr>
    <input id="evFmosinactivateddh" type="hidden"
           value="${itemSum.evFmosinactivateddh?default(0)-item.evFmosinactivateddh?default(0)}"/>
    <input id="evFmosinactivatedx" type="hidden"
           value="${itemSum.evFmosinactivatedx?default(0)-item.evFmosinactivatedx?default(0)}"/>
    <input id="evFmoasdh" type="hidden" value="${itemSum.evFmoasdh?default(0)-item.evFmoasdh?default(0)}"/>
    <input id="evFmoasx" type="hidden" value="${itemSum.evFmoasx?default(0)-item.evFmoasx?default(0)}"/>
    <tr class="r1">
        <td class="c10">口蹄疫O型-A型-亚洲I型三价灭活疫苗（万毫升）</td>
        <td role="data" n="evFmo3inactivateddh"
            class="c5"><#if item.evFmo3inactivateddh??>${item.evFmo3inactivateddh}</#if></td>
        <td role="lj_evFmo3inactivateddh"
            class="c6"><#if itemSum??&&itemSum.evFmo3inactivateddh??>${itemSum.evFmo3inactivateddh}</#if></td>
        <td role="data" n="evFmo3inactivatedx"
            class="c5"><#if item.evFmo3inactivatedx??>${item.evFmo3inactivatedx}</#if></td>
        <td role="lj_evFmo3inactivatedx"
            class="c6"><#if itemSum??&&itemSum.evFmo3inactivatedx??>${itemSum.evFmo3inactivatedx}</#if></td>
        
    </tr>
    <tr class="r1">
        <td class="c11">口蹄疫A型灭活疫苗（万毫升）</td>
        <td role="data" n="evFmoadh" class="c12"><#if item.evFmoadh??>${item.evFmoadh}</#if></td>
        <td role="lj_evFmoadh" class="c6"><#if itemSum??&&itemSum.evFmoadh??>${itemSum.evFmoadh}</#if></td>
        <td role="data" n="evFmoax" class="c12"><#if item.evFmoax??>${item.evFmoax}</#if></td>
        <td role="lj_evFmoax" class="c6"><#if itemSum??&&itemSum.evFmoax??>${itemSum.evFmoax}</#if></td>
      
    </tr>
    <input id="evFmo3inactivateddh" type="hidden"
           value="${itemSum.evFmo3inactivateddh?default(0)-item.evFmo3inactivateddh?default(0)}"/>
    <input id="evFmo3inactivatedx" type="hidden"
           value="${itemSum.evFmo3inactivatedx?default(0)-item.evFmo3inactivatedx?default(0)}"/>
    <input id="evFmoadh" type="hidden" value="${itemSum.evFmoadh?default(0)-item.evFmoadh?default(0)}"/>
    <input id="evFmoax" type="hidden" value="${itemSum.evFmoax?default(0)-item.evFmoax?default(0)}"/>
    <tr class="r1">
        <td class="c3" rowspan="11">禽流感</td>
        <td class="c2">禽流感灭活疫苗（H5N1，Re-4株）（万毫升）</td>
        <td role="data" n="evAih5n1re4dh" class="c3"><#if item.evAih5n1re4dh??>${item.evAih5n1re4dh}</#if></td>
        <td role="lj_evAih5n1re4dh"
            class="c6"><#if itemSum??&&itemSum.evAih5n1re4dh??>${itemSum.evAih5n1re4dh}</#if></td>
        <td role="data" n="evAih5n1re4x" class="c3"><#if item.evAih5n1re4x??>${item.evAih5n1re4x}</#if></td>
        <td role="lj_evAih5n1re4x" class="c6"><#if itemSum??&&itemSum.evAih5n1re4x??>${itemSum.evAih5n1re4x}</#if></td>
       
    </tr>
    <tr class="r1">
        <td class="c2">禽流感灭活疫苗（H5N1，Re-5株）（万毫升）</td>
        <td role="data" n="evAih5n1re5dh" class="c3"><#if item.evAih5n1re5dh??>${item.evAih5n1re5dh}</#if></td>
        <td role="lj_evAih5n1re5dh"
            class="c6"><#if itemSum??&&itemSum.evAih5n1re5dh??>${itemSum.evAih5n1re5dh}</#if></td>
        <td role="data" n="evAih5n1re5x" class="c3"><#if item.evAih5n1re5x??>${item.evAih5n1re5x}</#if></td>
        <td role="lj_evAih5n1re5x" class="c6"><#if itemSum??&&itemSum.evAih5n1re5x??>${itemSum.evAih5n1re5x}</#if></td>
       
    </tr>
    <input id="evAih5n1re4dh" type="hidden" value="${itemSum.evAih5n1re4dh?default(0)-item.evAih5n1re4dh?default(0)}"/>
    <input id="evAih5n1re4x" type="hidden" value="${itemSum.evAih5n1re4x?default(0)-item.evAih5n1re4x?default(0)}"/>
    <input id="evAih5n1re5dh" type="hidden" value="${itemSum.evAih5n1re5dh?default(0)-item.evAih5n1re5dh?default(0)}"/>
    <input id="evAih5n1re5x" type="hidden" value="${itemSum.evAih5n1re5x?default(0)-item.evAih5n1re5x?default(0)}"/>
    <tr class="r1">
        <td class="c2">禽流感灭活疫苗（H5N1，Re-5+Re-4株）（万毫升）</td>
        <td role="data" n="evAllaih5n1re5re4dh"
            class="c3"><#if item.evAllaih5n1re5re4dh??>${item.evAllaih5n1re5re4dh}</#if></td>
        <td role="lj_evAllaih5n1re5re4dh"
            class="c6"><#if itemSum??&&itemSum.evAllaih5n1re5re4dh??>${itemSum.evAllaih5n1re5re4dh}</#if></td>
        <td role="data" n="evAllaih5n1re5re4x"
            class="c3"><#if item.evAllaih5n1re5re4x??>${item.evAllaih5n1re5re4x}</#if></td>
        <td role="lj_evAllaih5n1re5re4x"
            class="c6"><#if itemSum??&&itemSum.evAllaih5n1re5re4x??>${itemSum.evAllaih5n1re5re4x}</#if></td>
      
    </tr>
    <tr class="r1">
        <td class="c2">H5-H9二价灭活疫苗（万毫升）</td>
        <td role="data" n="evAih5h9dh" class="c3"><#if item.evAih5h9dh??>${item.evAih5h9dh}</#if></td>
        <td role="lj_evAih5h9dh" class="c6"><#if itemSum??&&itemSum.evAih5h9dh??>${itemSum.evAih5h9dh}</#if></td>
        <td role="data" n="evAih5h9x" role="data" class="c3"><#if item.evAih5h9x??>${item.evAih5h9x}</#if></td>
        <td role="lj_evAih5h9x" class="c6"><#if itemSum??&&itemSum.evAih5h9x??>${itemSum.evAih5h9x}</#if></td>
       
    </tr>
    <input id="evAllaih5n1re5re4dh" type="hidden"
           value="${itemSum.evAllaih5n1re5re4dh?default(0)-item.evAllaih5n1re5re4dh?default(0)}"/>
    <input id="evAllaih5n1re5re4x" type="hidden"
           value="${itemSum.evAllaih5n1re5re4x?default(0)-item.evAllaih5n1re5re4x?default(0)}"/>
    <input id="evAih5h9dh" type="hidden" value="${itemSum.evAih5h9dh?default(0)-item.evAih5h9dh?default(0)}"/>
    <input id="evAih5h9x" type="hidden" value="${itemSum.evAih5h9x?default(0)-item.evAih5h9x?default(0)}"/>
    <tr class="r1">
        <td class="c2">重组禽流感灭活疫苗（H5N1,Re-6株）（万毫升）</td>
        <td role="data" n="evAih5n1re6dh" class="c3"><#if item.evAih5n1re6dh??>${item.evAih5n1re6dh}</#if></td>
        <td role="lj_evAih5n1re6dh"
            class="c6"><#if itemSum??&&itemSum.evAih5n1re6dh??>${itemSum.evAih5n1re6dh}</#if></td>
        <td role="data" n="evAih5n1re6x" class="c3"><#if item.evAih5n1re6x??>${item.evAih5n1re6x}</#if></td>
        <td role="lj_evAih5n1re6x" class="c6"><#if itemSum??&&itemSum.evAih5n1re6x??>${itemSum.evAih5n1re6x}</#if></td>
        
    </tr>
    <tr class="r1">
        <td class="c2">重组禽流感灭活疫苗（H5N1,Re-7株）（万毫升）</td>
        <td role="data" n="evAih5n1re7dh" class="c3"><#if item.evAih5n1re7dh??>${item.evAih5n1re7dh}</#if></td>
        <td role="lj_evAih5n1re7dh"
            class="c6"><#if itemSum??&&itemSum.evAih5n1re7dh??>${itemSum.evAih5n1re7dh}</#if></td>
        <td role="data" n="evAih5n1re7x" class="c3"><#if item.evAih5n1re7x??>${item.evAih5n1re7x}</#if></td>
        <td role="lj_evAih5n1re7x" class="c6"><#if itemSum??&&itemSum.evAih5n1re7x??>${itemSum.evAih5n1re7x}</#if></td>
     
    </tr>
    <input id="evAih5n1re6dh" type="hidden" value="${itemSum.evAih5n1re6dh?default(0)-item.evAih5n1re6dh?default(0)}"/>
    <input id="evAih5n1re6x" type="hidden" value="${itemSum.evAih5n1re6x?default(0)-item.evAih5n1re6x?default(0)}"/>
    <input id="evAih5n1re7dh" type="hidden" value="${itemSum.evAih5n1re7dh?default(0)-item.evAih5n1re7dh?default(0)}"/>
    <input id="evAih5n1re7x" type="hidden" value="${itemSum.evAih5n1re7x?default(0)-item.evAih5n1re7x?default(0)}"/>
    <tr class="r1">
        <td class="c2">重组禽流感病毒H5亚型二价灭活疫苗（H5N1,Re-6+Re-7株）（万毫升）</td>
        <td role="data" n="evAih5n1re6re7dh" class="c3"><#if item.evAih5n1re6re7dh??>${item.evAih5n1re6re7dh}</#if></td>
        <td role="lj_evAih5n1re6re7dh"
            class="c6"><#if itemSum??&&itemSum.evAih5n1re6re7dh??>${itemSum.evAih5n1re6re7dh}</#if></td>
        <td role="data" n="evAih5n1re6re7x" class="c3"><#if item.evAih5n1re6re7x??>${item.evAih5n1re6re7x}</#if></td>
        <td role="lj_evAih5n1re6re7x"
            class="c6"><#if itemSum??&&itemSum.evAih5n1re6re7x??>${itemSum.evAih5n1re6re7x}</#if></td>
       
    </tr>
    <tr class="r1">
        <td class="c2">重组禽流感病毒H5亚型二价灭活疫苗（H5N1,Re-6+Re-8株）（万毫升）</td>
        <td role="data" n="evAih5n1re6re8dh" class="c3"><#if item.evAih5n1re6re8dh??>${item.evAih5n1re6re8dh}</#if></td>
        <td role="lj_evAih5n1re6re8dh"
            class="c6"><#if itemSum??&&itemSum.evAih5n1re6re8dh??>${itemSum.evAih5n1re6re8dh}</#if></td>
        <td role="data" n="evAih5n1re6re8x" class="c3"><#if item.evAih5n1re6re8x??>${item.evAih5n1re6re8x}</#if></td>
        <td role="lj_evAih5n1re6re8x"
            class="c6"><#if itemSum??&&itemSum.evAih5n1re6re8x??>${itemSum.evAih5n1re6re8x}</#if></td>
       
    </tr>
    <input id="evAih5n1re6re7dh" type="hidden"
           value="${itemSum.evAih5n1re6re7dh?default(0)-item.evAih5n1re6re7dh?default(0)}"/>
    <input id="evAih5n1re6re7x" type="hidden"
           value="${itemSum.evAih5n1re6re7x?default(0)-item.evAih5n1re6re7x?default(0)}"/>
    <input id="evAih5n1re6re8dh" type="hidden"
           value="${itemSum.evAih5n1re6re8dh?default(0)-item.evAih5n1re6re8dh?default(0)}"/>
    <input id="evAih5n1re6re8x" type="hidden"
           value="${itemSum.evAih5n1re6re8x?default(0)-item.evAih5n1re6re8x?default(0)}"/>
    <tr class="r1">
        <td class="c2">重组禽流感病毒H5亚型三价灭活疫苗（H5N1,Re-6+Re-7株+Re-8株）（万毫升）</td>
        <td role="data" n="evAih5n1re6re7re8dh"
            class="c3"><#if item.evAih5n1re6re7re8dh??>${item.evAih5n1re6re7re8dh}</#if></td>
        <td role="lj_evAih5n1re6re7re8dh"
            class="c6"><#if itemSum??&&itemSum.evAih5n1re6re7re8dh??>${itemSum.evAih5n1re6re7re8dh}</#if></td>
        <td role="data" n="evAih5n1re6re7re8x"
            class="c3"><#if item.evAih5n1re6re7re8x??>${item.evAih5n1re6re7re8x}</#if></td>
        <td role="lj_evAih5n1re6re7re8x"
            class="c6"><#if itemSum??&&itemSum.evAih5n1re6re7re8x??>${itemSum.evAih5n1re6re7re8x}</#if></td>
       
    </tr>
    <tr class="r1">
        <td class="c2">禽流感灭活疫苗（H5N2亚型，D7株）</td>
        <td role="data" n="evAih5n2d7dh" class="c3"><#if item.evAih5n2d7dh??>${item.evAih5n2d7dh}</#if></td>
        <td role="lj_evAih5n2d7dh" class="c6"><#if itemSum??&&itemSum.evAih5n2d7dh??>${itemSum.evAih5n2d7dh}</#if></td>
        <td role="data" n="evAih5n2d7x" class="c3"><#if item.evAih5n2d7x??>${item.evAih5n2d7x}</#if></td>
        <td role="lj_evAih5n2d7x" class="c6"><#if itemSum??&&itemSum.evAih5n2d7x??>${itemSum.evAih5n2d7x}</#if></td>
        
    </tr>
    <input id="evAih5n1re6re7re8dh" type="hidden"
           value="${itemSum.evAih5n1re6re7re8dh?default(0)-item.evAih5n1re6re7re8dh?default(0)}"/>
    <input id="evAih5n1re6re7re8x" type="hidden"
           value="${itemSum.evAih5n1re6re7re8x?default(0)-item.evAih5n1re6re7re8x?default(0)}"/>
    <input id="evAih5n2d7dh" type="hidden" value="${itemSum.evAih5n2d7dh?default(0)-item.evAih5n2d7dh?default(0)}"/>
    <input id="evAih5n2d7x" type="hidden" value="${itemSum.evAih5n2d7x?default(0)-item.evAih5n2d7x?default(0)}"/>
    <tr class="r1">
        <td class="c2">禽流感-新城疫重组二联活疫苗（rL-H5株）（万羽份）</td>
        <td role="data" n="evAirlh5dh" class="c3"><#if item.evAirlh5dh??>${item.evAirlh5dh}</#if></td>
        <td role="lj_evAirlh5dh" class="c6"><#if itemSum??&&itemSum.evAirlh5dh??>${itemSum.evAirlh5dh}</#if></td>
        <td role="data" n="evAirlh5x" class="c3"><#if item.evAirlh5x??>${item.evAirlh5x}</#if></td>
        <td role="lj_evAirlh5x" class="c6"><#if itemSum??&&itemSum.evAirlh5x??>${itemSum.evAirlh5x}</#if></td>
        
    </tr>
    <tr class="r1">
        <td class="c3" rowspan="2">高致病性猪蓝耳病疫苗</td>
        <td class="c2">高致病性猪蓝耳病活疫苗(万头份)</td>
        <td role="data" n="evBedh" class="c3"><#if item.evBedh??>${item.evBedh}</#if></td>
        <td role="lj_evBedh" class="c6"><#if itemSum??&&itemSum.evBedh??>${itemSum.evBedh}</#if></td>
        <td role="data" n="evBex" class="c3"><#if item.evBex??>${item.evBex}</#if></td>
        <td role="lj_evBex" class="c6"><#if itemSum??&&itemSum.evBex??>${itemSum.evBex}</#if></td>
        
    </tr>
    <input id="evAirlh5dh" type="hidden" value="${itemSum.evAirlh5dh?default(0)-item.evAirlh5dh?default(0)}"/>
    <input id="evAirlh5x" type="hidden" value="${itemSum.evAirlh5x?default(0)-item.evAirlh5x?default(0)}"/>
    <input id="evBedh" type="hidden" value="${itemSum.evBedh?default(0)-item.evBedh?default(0)}"/>
    <input id="evBex" type="hidden" value="${itemSum.evBex?default(0)-item.evBex?default(0)}"/>
    <tr class="r1">
        <td class="c2">高致病性猪蓝耳病灭活疫苗(万毫升)</td>
        <td role="data" n="evBeinactivateddh"
            class="c3"><#if item.evBeinactivateddh??>${item.evBeinactivateddh}</#if></td>
        <td role="lj_evBeinactivateddh"
            class="c6"><#if itemSum??&&itemSum.evBeinactivateddh??>${itemSum.evBeinactivateddh}</#if></td>
        <td role="data" n="evBeinactivatedx" class="c3"><#if item.evBeinactivatedx??>${item.evBeinactivatedx}</#if></td>
        <td role="lj_evBeinactivatedx"
            class="c6"><#if itemSum??&&itemSum.evBeinactivatedx??>${itemSum.evBeinactivatedx}</#if></td>
       
    </tr>
    <input id="evBeinactivateddh" type="hidden"
           value="${itemSum.evBeinactivateddh?default(0)-item.evBeinactivateddh?default(0)}"/>
    <input id="evBeinactivatedx" type="hidden"
           value="${itemSum.evBeinactivatedx?default(0)-item.evBeinactivatedx?default(0)}"/>
    <tr class="r1">
        <td class="c3" rowspan="2">猪瘟疫苗</td>
        <td class="c2">猪瘟活疫苗(万头份)</td>
        <td role="data" n="evCsdh" class="c3"><#if item.evCsdh??>${item.evCsdh}</#if></td>
        <td role="lj_evCsdh" class="c6"><#if itemSum??&&itemSum.evCsdh??>${itemSum.evCsdh}</#if></td>
        <td role="data" n="evCsx" class="c3"><#if item.evCsx??>${item.evCsx}</#if></td>
        <td role="lj_evCsx" class="c6"><#if itemSum??&&itemSum.evCsx??>${itemSum.evCsx}</#if></td>
        
    </tr>
    <tr class="r1">
        <td class="c2">传代细胞源猪瘟活疫苗（万头份）</td>
        <td role="data" n="evCspassagedh" class="c3"><#if item.evCspassagedh??>${item.evCspassagedh}</#if></td>
        <td role="lj_evCspassagedh"
            class="c6"><#if itemSum??&&itemSum.evCspassagedh??>${itemSum.evCspassagedh}</#if></td>
        <td role="data" n="evCspassagex" class="c3"><#if item.evCspassagex??>${item.evCspassagex}</#if></td>
        <td role="lj_evCspassagex" class="c6"><#if itemSum??&&itemSum.evCspassagex??>${itemSum.evCspassagex}</#if></td>
        
    </tr>
    <input id="evCsdh" type="hidden" value="${itemSum.evCsdh?default(0)-item.evCsdh?default(0)}"/>
    <input id="evCsx" type="hidden" value="${itemSum.evCsx?default(0)-item.evCsx?default(0)}"/>
    <input id="evCspassagedh" type="hidden" value="${itemSum.evCspassagedh?default(0)-item.evCspassagedh?default(0)}"/>
    <input id="evCspassagex" type="hidden" value="${itemSum.evCspassagex?default(0)-item.evCspassagex?default(0)}"/>
    <tr class="r1">
        <td class="c2" rowspan="2">新城疫疫苗</td>
        <td class="c2">新城疫灭活疫苗(万毫升)</td>
        <td role="data" n="evNcinactivateddh"
            class="c3"><#if item.evNcinactivateddh??>${item.evNcinactivateddh}</#if></td>
        <td role="lj_evNcinactivateddh"
            class="c6"><#if itemSum??&&itemSum.evNcinactivateddh??>${itemSum.evNcinactivateddh}</#if></td>
        <td role="data" n="evNcinactivatedx" class="c3"><#if item.evNcinactivatedx??>${item.evNcinactivatedx}</#if></td>
        <td role="lj_evNcinactivatedx"
            class="c6"><#if itemSum??&&itemSum.evNcinactivatedx??>${itemSum.evNcinactivatedx}</#if></td>
        
    </tr>
    <tr class="r1">
        <td class="c2">新城疫弱毒疫苗(万羽份)</td>
        <td role="data" n="evNcweakdh" class="c3"><#if item.evNcweakdh??>${item.evNcweakdh}</#if></td>
        <td role="lj_evNcweakdh" class="c6"><#if itemSum??&&itemSum.evNcweakdh??>${itemSum.evNcweakdh}</#if></td>
        <td role="data" n="evNcweakx" class="c3"><#if item.evNcweakx??>${item.evNcweakx}</#if></td>
        <td role="lj_evNcweakx" class="c6"><#if itemSum??&&itemSum.evNcweakx??>${itemSum.evNcweakx}</#if></td>
       
    </tr>
    <input id="evNcinactivateddh" type="hidden"
           value="${itemSum.evNcinactivateddh?default(0)-item.evNcinactivateddh?default(0)}"/>
    <input id="evNcinactivatedx" type="hidden"
           value="${itemSum.evNcinactivatedx?default(0)-item.evNcinactivatedx?default(0)}"/>
    <input id="evNcweakdh" type="hidden" value="${itemSum.evNcweakdh?default(0)-item.evNcweakdh?default(0)}"/>
    <input id="evNcweakx" type="hidden" value="${itemSum.evNcweakx?default(0)-item.evNcweakx?default(0)}"/>
    <tr class="r1">
        <td class="c3">小反刍兽疫疫苗</td>
        <td class="c2">小反刍兽疫活疫苗（万头份）（万头份）</td>
        <td role="data" n="evPdprdh" class="c3"><#if item.evPdprdh??>${item.evPdprdh}</#if></td>
        <td role="lj_evPdprdh" class="c6"><#if itemSum??&&itemSum.evPdprdh??>${itemSum.evPdprdh}</#if></td>
        <td role="data" n="evPdprx" class="c3"><#if item.evPdprx??>${item.evPdprx}</#if></td>
        <td role="lj_evPdprx" class="c6"><#if itemSum??&&itemSum.evPdprx??>${itemSum.evPdprx}</#if></td>
        
    </tr>
    <input id="evPdprdh" type="hidden" value="${itemSum.evPdprdh?default(0)-item.evPdprdh?default(0)}"/>
    <input id="evPdprx" type="hidden" value="${itemSum.evPdprx?default(0)-item.evPdprx?default(0)}"/>
    <tr class="r1">
        <td class="c3" rowspan="3">布鲁氏菌病</td>
        <td class="c2">布鲁氏菌活疫苗（S2株）（万头份）</td>
        <td role="data" n="evBrucellas2dh" class="c3"><#if item.evBrucellas2dh??>${item.evBrucellas2dh}</#if></td>
        <td role="lj_evBrucellas2dh"
            class="c6"><#if itemSum??&&itemSum.evBrucellas2dh??>${itemSum.evBrucellas2dh}</#if></td>
        <td role="data" n="evBrucellas2x" class="c3"><#if item.evBrucellas2x??>${item.evBrucellas2x}</#if></td>
        <td role="lj_evBrucellas2x"
            class="c6"><#if itemSum??&&itemSum.evBrucellas2x??>${itemSum.evBrucellas2x}</#if></td>
        
    </tr>
    <input id="evBrucellas2dh" type="hidden"
           value="${itemSum.evBrucellas2dh?default(0)-item.evBrucellas2dh?default(0)}"/>
    <input id="evBrucellas2x" type="hidden" value="${itemSum.evBrucellas2x?default(0)-item.evBrucellas2x?default(0)}"/>
    <input id="evBrucellaa19dh" type="hidden"
           value="${itemSum.evBrucellaa19dh?default(0)-item.evBrucellaa19dh?default(0)}"/>
    <input id="evBrucellaa19x" type="hidden"
           value="${itemSum.evBrucellaa19x?default(0)-item.evBrucellaa19x?default(0)}"/>
    <tr class="r1">
        <td class="c2">布鲁氏菌活疫苗（M5株）（万头份）</td>
        <td role="data" n="evBrucellam5dh" class="c3"><#if item.evBrucellam5dh??>${item.evBrucellam5dh}</#if></td>
        <td role="lj_evBrucellam5dh"
            class="c6"><#if itemSum??&&itemSum.evBrucellam5dh??>${itemSum.evBrucellam5dh}</#if></td>
        <td role="data" n="evBrucellam5x" class="c3"><#if item.evBrucellam5x??>${item.evBrucellam5x}</#if></td>
        <td role="lj_evBrucellam5x"
            class="c6"><#if itemSum??&&itemSum.evBrucellam5x??>${itemSum.evBrucellam5x}</#if></td>
        
    </tr>
    <input id="evBrucellam5dh" type="hidden"
           value="${itemSum.evBrucellam5dh?default(0)-item.evBrucellam5dh?default(0)}"/>
    <input id="evBrucellam5x" type="hidden" value="${itemSum.evBrucellam5x?default(0)-item.evBrucellam5x?default(0)}"/>

    <tr class="r1">
        <td class="c2">布鲁氏菌活疫苗（A19株）（万头份）</td>
        <td role="data" n="evBrucellaa19dh" class="c3"><#if item.evBrucellaa19dh??>${item.evBrucellaa19dh}</#if></td>
        <td role="lj_evBrucellaa19dh"
            class="c6"><#if itemSum??&&itemSum.evBrucellaa19dh??>${itemSum.evBrucellaa19dh}</#if></td>
        <td role="data" n="evBrucellaa19x" class="c3"><#if item.evBrucellaa19x??>${item.evBrucellaa19x}</#if></td>
        <td role="lj_evBrucellaa19x"
            class="c6"><#if itemSum??&&itemSum.evBrucellaa19x??>${itemSum.evBrucellaa19x}</#if></td>
       
    </tr>
    <input id="evBrucellaa19dh" type="hidden"
           value="${itemSum.evBrucellaa19dh?default(0)-item.evBrucellaa19dh?default(0)}"/>
    <input id="evBrucellaa19x" type="hidden"
           value="${itemSum.evBrucellaa19x?default(0)-item.evBrucellaa19x?default(0)}"/>
    <input id="evSheephydatiddh" type="hidden"
           value="${itemSum.evSheephydatiddh?default(0)-item.evSheephydatiddh?default(0)}"/>
    <input id="evSheephydatidx" type="hidden"
           value="${itemSum.evSheephydatidx?default(0)-item.evSheephydatidx?default(0)}"/>
    <tr class="r1">
        <td class="c3">棘球蚴病（包虫病）</td>
        <td class="c2">羊棘球蚴（包虫）病基因工程亚单位疫苗（万头份）</td>
        <td role="data" n="evSheephydatiddh" class="c3"><#if item.evSheephydatiddh??>${item.evSheephydatiddh}</#if></td>
        <td role="lj_evSheephydatiddh"
            class="c6"><#if itemSum??&&itemSum.evSheephydatiddh??>${itemSum.evSheephydatiddh}</#if></td>
        <td role="data" n="evSheephydatidx" class="c3"><#if item.evSheephydatidx??>${item.evSheephydatidx}</#if></td>
        <td role="lj_evSheephydatidx"
            class="c6"><#if itemSum??&&itemSum.evSheephydatidx??>${itemSum.evSheephydatidx}</#if></td>
       
    </tr>

    </tbody>
</table>
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
                input.focus();
                input.select();
                e.stopPropagation()
            })
        })

        var calculate = function () {
            var evFmoinactivateddh = $.trim($('td[n="evFmoinactivateddh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evFmoinactivateddh"]').text()));
            var evFmoinactivatedx = $.trim($('td[n="evFmoinactivatedx"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evFmoinactivatedx"]').text()));
            var evFmosyntheticdh = $.trim($('td[n="evFmosyntheticdh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evFmosyntheticdh"]').text()));
            var evFmosyntheticx = $.trim($('td[n="evFmosyntheticx"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evFmosyntheticx"]').text()));
            var lj_evFmoinactivateddh = document.getElementById('evFmoinactivateddh').value;
            var lj_evFmoinactivatedx = document.getElementById('evFmoinactivatedx').value;
            var lj_evFmosyntheticdh = document.getElementById('evFmosyntheticdh').value;
            var lj_evFmosyntheticx = document.getElementById('evFmosyntheticx').value;
            var evFmosinactivateddh = $.trim($('td[n="evFmosinactivateddh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evFmosinactivateddh"]').text()));
            var evFmosinactivatedx = $.trim($('td[n="evFmosinactivatedx"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evFmosinactivatedx"]').text()));
            var evFmoasdh = $.trim($('td[n="evFmoasdh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evFmoasdh"]').text()));
            var evFmoasx = $.trim($('td[n="evFmoasx"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evFmoasx"]').text()));
            var lj_evFmosinactivateddh = document.getElementById('evFmosinactivateddh').value;
            var lj_evFmosinactivatedx = document.getElementById('evFmosinactivatedx').value;
            var lj_evFmoasdh = document.getElementById('evFmoasdh').value;
            var lj_evFmoasx = document.getElementById('evFmoasx').value;
            var evFmo3inactivateddh = $.trim($('td[n="evFmo3inactivateddh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evFmo3inactivateddh"]').text()));
            var evFmo3inactivatedx = $.trim($('td[n="evFmo3inactivatedx"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evFmo3inactivatedx"]').text()));
            var evFmoadh = $.trim($('td[n="evFmoadh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evFmoadh"]').text()));
            var evFmoax = $.trim($('td[n="evFmoax"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evFmoax"]').text()));
            var lj_evFmo3inactivateddh = document.getElementById('evFmo3inactivateddh').value;
            var lj_evFmo3inactivatedx = document.getElementById('evFmo3inactivatedx').value;
            var lj_evFmoadh = document.getElementById('evFmoadh').value;
            var lj_evFmoax = document.getElementById('evFmoax').value;
            var evAih5n1re4dh = $.trim($('td[n="evAih5n1re4dh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evAih5n1re4dh"]').text()));
            var evAih5n1re4x = $.trim($('td[n="evAih5n1re4x"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evAih5n1re4x"]').text()));
            var evAih5n1re5dh = $.trim($('td[n="evAih5n1re5dh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evAih5n1re5dh"]').text()));
            var evAih5n1re5x = $.trim($('td[n="evAih5n1re5x"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evAih5n1re5x"]').text()));
            var lj_evAih5n1re4dh = document.getElementById('evAih5n1re4dh').value;
            var lj_evAih5n1re4x = document.getElementById('evAih5n1re4x').value;
            var lj_evAih5n1re5dh = document.getElementById('evAih5n1re5dh').value;
            var lj_evAih5n1re5x = document.getElementById('evAih5n1re5x').value;
            var evAih5n1re6dh = $.trim($('td[n="evAih5n1re6dh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evAih5n1re6dh"]').text()));
            var evAih5n1re6x = $.trim($('td[n="evAih5n1re6x"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evAih5n1re6x"]').text()));
            var evAih5n1re7dh = $.trim($('td[n="evAih5n1re7dh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evAih5n1re7dh"]').text()));
            var evAih5n1re7x = $.trim($('td[n="evAih5n1re7x"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evAih5n1re7x"]').text()));
            var lj_evAih5n1re6dh = document.getElementById('evAih5n1re6dh').value;
            var lj_evAih5n1re6x = document.getElementById('evAih5n1re6x').value;
            var lj_evAih5n1re7dh = document.getElementById('evAih5n1re7dh').value;
            var lj_evAih5n1re7x = document.getElementById('evAih5n1re7x').value;
            $("td[role=lj_evFmoinactivateddh]").text((parseFloat(lj_evFmoinactivateddh) + parseFloat(evFmoinactivateddh)).toFixed(2));
            $("td[role=lj_evFmoinactivatedx]").text((parseFloat(lj_evFmoinactivatedx) + parseFloat(evFmoinactivatedx)).toFixed(2));
            $("td[role=lj_evFmosyntheticdh]").text((parseFloat(lj_evFmosyntheticdh) + parseFloat(evFmosyntheticdh)).toFixed(2));
            $("td[role=lj_evFmosyntheticx]").text((parseFloat(lj_evFmosyntheticx) + parseFloat(evFmosyntheticx)).toFixed(2));
            $("td[role=lj_evFmosinactivateddh]").text((parseFloat(lj_evFmosinactivateddh) + parseFloat(evFmosinactivateddh)).toFixed(2));
            $("td[role=lj_evFmosinactivatedx]").text((parseFloat(lj_evFmosinactivatedx) + parseFloat(evFmosinactivatedx)).toFixed(2));
            $("td[role=lj_evFmoasdh]").text((parseFloat(lj_evFmoasdh) + parseFloat(evFmoasdh)).toFixed(2));
            $("td[role=lj_evFmoasx]").text((parseFloat(lj_evFmoasx) + parseFloat(evFmoasx)).toFixed(2));
            $("td[role=lj_evFmo3inactivateddh]").text((parseFloat(lj_evFmo3inactivateddh) + parseFloat(evFmo3inactivateddh)).toFixed(2));
            $("td[role=lj_evFmo3inactivatedx]").text((parseFloat(lj_evFmo3inactivatedx) + parseFloat(evFmo3inactivatedx)).toFixed(2));
            $("td[role=lj_evFmoadh]").text((parseFloat(lj_evFmoadh) + parseFloat(evFmoadh)).toFixed(2));
            $("td[role=lj_evFmoax]").text((parseFloat(lj_evFmoax) + parseFloat(evFmoax)).toFixed(2));
            $("td[role=lj_evAih5n1re4dh]").text((parseFloat(lj_evAih5n1re4dh) + parseFloat(evAih5n1re4dh)).toFixed(2));
            $("td[role=lj_evAih5n1re4x]").text((parseFloat(lj_evAih5n1re4x) + parseFloat(evAih5n1re4x)).toFixed(2));
            $("td[role=lj_evAih5n1re5dh]").text((parseFloat(lj_evAih5n1re5dh) + parseFloat(evAih5n1re5dh)).toFixed(2));
            $("td[role=lj_evAih5n1re5x]").text((parseFloat(lj_evAih5n1re5x) + parseFloat(evAih5n1re5x)).toFixed(2));
            $("td[role=lj_evAih5n1re6dh]").text((parseFloat(lj_evAih5n1re6dh) + parseFloat(evAih5n1re6dh)).toFixed(2));
            $("td[role=lj_evAih5n1re6x]").text((parseFloat(lj_evAih5n1re6x) + parseFloat(evAih5n1re6x)).toFixed(2));
            $("td[role=lj_evAih5n1re7dh]").text((parseFloat(lj_evAih5n1re7dh) + parseFloat(evAih5n1re7dh)).toFixed(2));
            $("td[role=lj_evAih5n1re7x]").text((parseFloat(lj_evAih5n1re7x) + parseFloat(evAih5n1re7x)).toFixed(2));
            var evAih5n1re6re7dh = $.trim($('td[n="evAih5n1re6re7dh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evAih5n1re6re7dh"]').text()));
            var evAih5n1re6re7x = $.trim($('td[n="evAih5n1re6re7x"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evAih5n1re6re7x"]').text()));
            var evAih5n1re6re8dh = $.trim($('td[n="evAih5n1re6re8dh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evAih5n1re6re8dh"]').text()));
            var evAih5n1re6re8x = $.trim($('td[n="evAih5n1re6re8x"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evAih5n1re6re8x"]').text()));
            var lj_evAih5n1re6re7dh = document.getElementById('evAih5n1re6re7dh').value;
            var lj_evAih5n1re6re7x = document.getElementById('evAih5n1re6re7x').value;
            var lj_evAih5n1re6re8dh = document.getElementById('evAih5n1re6re8dh').value;
            var lj_evAih5n1re6re8x = document.getElementById('evAih5n1re6re8x').value;
            $("td[role=lj_evAih5n1re6re7dh]").text((parseFloat(lj_evAih5n1re6re7dh) + parseFloat(evAih5n1re6re7dh)).toFixed(2));
            $("td[role=lj_evAih5n1re6re7x]").text((parseFloat(lj_evAih5n1re6re7x) + parseFloat(evAih5n1re6re7x)).toFixed(2));
            $("td[role=lj_evAih5n1re6re8dh]").text((parseFloat(lj_evAih5n1re6re8dh) + parseFloat(evAih5n1re6re8dh)).toFixed(2));
            $("td[role=lj_evAih5n1re6re8x]").text((parseFloat(lj_evAih5n1re6re8x) + parseFloat(evAih5n1re6re8x)).toFixed(2));
            var evAih5n1re6re7re8dh = $.trim($('td[n="evAih5n1re6re7re8dh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evAih5n1re6re7re8dh"]').text()));
            var evAih5n1re6re7re8x = $.trim($('td[n="evAih5n1re6re7re8x"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evAih5n1re6re7re8x"]').text()));
            var evAih5n2d7dh = $.trim($('td[n="evAih5n2d7dh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evAih5n2d7dh"]').text()));
            var evAih5n2d7x = $.trim($('td[n="evAih5n2d7x"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evAih5n2d7x"]').text()));
            var lj_evAih5n1re6re7re8dh = document.getElementById('evAih5n1re6re7re8dh').value;
            var lj_evAih5n1re6re7re8x = document.getElementById('evAih5n1re6re7re8x').value;
            var lj_evAih5n2d7dh = document.getElementById('evAih5n2d7dh').value;
            var lj_evAih5n2d7x = document.getElementById('evAih5n2d7x').value;
            $("td[role=lj_evAih5n1re6re7re8dh]").text((parseFloat(lj_evAih5n1re6re7re8dh) + parseFloat(evAih5n1re6re7re8dh)).toFixed(2));
            $("td[role=lj_evAih5n1re6re7re8x]").text((parseFloat(lj_evAih5n1re6re7re8x) + parseFloat(evAih5n1re6re7re8x)).toFixed(2));
            $("td[role=lj_evAih5n2d7dh]").text((parseFloat(lj_evAih5n2d7dh) + parseFloat(evAih5n2d7dh)).toFixed(2));
            $("td[role=lj_evAih5n2d7x]").text((parseFloat(lj_evAih5n2d7x) + parseFloat(evAih5n2d7x)).toFixed(2));
            var evAirlh5dh = $.trim($('td[n="evAirlh5dh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evAirlh5dh"]').text()));
            var evAirlh5x = $.trim($('td[n="evAirlh5x"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evAirlh5x"]').text()));
            var evBedh = $.trim($('td[n="evBedh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evBedh"]').text()));
            var evBex = $.trim($('td[n="evBex"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evBex"]').text()));
            var lj_evAirlh5dh = document.getElementById('evAirlh5dh').value;
            var lj_evAirlh5x = document.getElementById('evAirlh5x').value;
            var lj_evBedh = document.getElementById('evBedh').value;
            var lj_evBex = document.getElementById('evBex').value;
            $("td[role=lj_evAirlh5dh]").text((parseFloat(lj_evAirlh5dh) + parseFloat(evAirlh5dh)).toFixed(2));
            $("td[role=lj_evAirlh5x]").text((parseFloat(lj_evAirlh5x) + parseFloat(evAirlh5x)).toFixed(2));
            $("td[role=lj_evBedh]").text((parseFloat(lj_evBedh) + parseFloat(evBedh)).toFixed(2));
            $("td[role=lj_evBex]").text((parseFloat(lj_evBex) + parseFloat(evBex)).toFixed(2));

            var evBeinactivateddh = $.trim($('td[n="evBeinactivateddh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evBeinactivateddh"]').text()));
            var evBeinactivatedx = $.trim($('td[n="evBeinactivatedx"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evBeinactivatedx"]').text()));
            var lj_evBeinactivateddh = document.getElementById('evBeinactivateddh').value;
            var lj_evBeinactivatedx = document.getElementById('evBeinactivatedx').value;
            $("td[role=lj_evBeinactivateddh]").text((parseFloat(lj_evBeinactivateddh) + parseFloat(evBeinactivateddh)).toFixed(2));
            $("td[role=lj_evBeinactivatedx]").text((parseFloat(lj_evBeinactivatedx) + parseFloat(evBeinactivatedx)).toFixed(2));
            var evCsdh = $.trim($('td[n="evCsdh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evCsdh"]').text()));
            var evCsx = $.trim($('td[n="evCsx"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evCsx"]').text()));
            var evCspassagedh = $.trim($('td[n="evCspassagedh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evCspassagedh"]').text()));
            var evCspassagex = $.trim($('td[n="evCspassagex"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evCspassagex"]').text()));
            var lj_evCsdh = document.getElementById('evCsdh').value;
            var lj_evCsx = document.getElementById('evCsx').value;
            var lj_evCspassagedh = document.getElementById('evCspassagedh').value;
            var lj_evCspassagex = document.getElementById('evCspassagex').value;
            $("td[role=lj_evCsdh]").text((parseFloat(lj_evCsdh) + parseFloat(evCsdh)).toFixed(2));
            $("td[role=lj_evCsx]").text((parseFloat(lj_evCsx) + parseFloat(evCsx)).toFixed(2));
            $("td[role=lj_evCspassagedh]").text((parseFloat(lj_evCspassagedh) + parseFloat(evCspassagedh)).toFixed(2));
            $("td[role=lj_evCspassagex]").text((parseFloat(lj_evCspassagex) + parseFloat(evCspassagex)).toFixed(2));
            var evNcinactivateddh = $.trim($('td[n="evNcinactivateddh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evNcinactivateddh"]').text()));
            var evNcinactivatedx = $.trim($('td[n="evNcinactivatedx"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evNcinactivatedx"]').text()));
            var evNcweakdh = $.trim($('td[n="evNcweakdh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evNcweakdh"]').text()));
            var evNcweakx = $.trim($('td[n="evNcweakx"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evNcweakx"]').text()));
            var lj_evNcinactivateddh = document.getElementById('evNcinactivateddh').value;
            var lj_evNcinactivatedx = document.getElementById('evNcinactivatedx').value;
            var lj_evNcweakdh = document.getElementById('evNcweakdh').value;
            var lj_evNcweakx = document.getElementById('evNcweakx').value;
            $("td[role=lj_evNcinactivateddh]").text((parseFloat(lj_evNcinactivateddh) + parseFloat(evNcinactivateddh)).toFixed(2));
            $("td[role=lj_evNcinactivatedx]").text((parseFloat(lj_evNcinactivatedx) + parseFloat(evNcinactivatedx)).toFixed(2));
            $("td[role=lj_evNcweakdh]").text((parseFloat(lj_evNcweakdh) + parseFloat(evNcweakdh)).toFixed(2));
            $("td[role=lj_evNcweakx]").text((parseFloat(lj_evNcweakx) + parseFloat(evNcweakx)).toFixed(2));
            var evBrucellas2dh = $.trim($('td[n="evBrucellas2dh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evBrucellas2dh"]').text()));
            var evBrucellas2x = $.trim($('td[n="evBrucellas2x"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evBrucellas2x"]').text()));
            var evBrucellaa19dh = $.trim($('td[n="evBrucellaa19dh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evBrucellaa19dh"]').text()));
            var evBrucellaa19x = $.trim($('td[n="evBrucellaa19x"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evBrucellaa19x"]').text()));
            var lj_evBrucellas2dh = document.getElementById('evBrucellas2dh').value;
            var lj_evBrucellas2x = document.getElementById('evBrucellas2x').value;
            var lj_evBrucellaa19dh = document.getElementById('evBrucellaa19dh').value;
            var lj_evBrucellaa19x = document.getElementById('evBrucellaa19x').value;
            $("td[role=lj_evBrucellas2dh]").text((parseFloat(lj_evBrucellas2dh) + parseFloat(evBrucellas2dh)).toFixed(2));
            $("td[role=lj_evBrucellas2x]").text((parseFloat(lj_evBrucellas2x) + parseFloat(evBrucellas2x)).toFixed(2));
            $("td[role=lj_evBrucellaa19dh]").text((parseFloat(lj_evBrucellaa19dh) + parseFloat(evBrucellaa19dh)).toFixed(2));
            $("td[role=lj_evBrucellaa19x]").text((parseFloat(lj_evBrucellaa19x) + parseFloat(evBrucellaa19x)).toFixed(2));
            var evBrucellaa19dh = $.trim($('td[n="evBrucellaa19dh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evBrucellaa19dh"]').text()));
            var evBrucellaa19x = $.trim($('td[n="evBrucellaa19x"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evBrucellaa19x"]').text()));
            var evSheephydatiddh = $.trim($('td[n="evSheephydatiddh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evSheephydatiddh"]').text()));
            var evSheephydatidx = $.trim($('td[n="evSheephydatidx"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evSheephydatidx"]').text()));
            var lj_evBrucellaa19dh = document.getElementById('evBrucellaa19dh').value;
            var lj_evBrucellaa19x = document.getElementById('evBrucellaa19x').value;
            var lj_evSheephydatiddh = document.getElementById('evSheephydatiddh').value;
            var lj_evSheephydatidx = document.getElementById('evSheephydatidx').value;
            $("td[role=lj_evBrucellaa19dh]").text((parseFloat(lj_evBrucellaa19dh) + parseFloat(evBrucellaa19dh)).toFixed(2));
            $("td[role=lj_evBrucellaa19x]").text((parseFloat(lj_evBrucellaa19x) + parseFloat(evBrucellaa19x)).toFixed(2));
            $("td[role=lj_evSheephydatiddh]").text((parseFloat(lj_evSheephydatiddh) + parseFloat(evSheephydatiddh)).toFixed(2));
            $("td[role=lj_evSheephydatidx]").text((parseFloat(lj_evSheephydatidx) + parseFloat(evSheephydatidx)).toFixed(2));
            var evAllaih5n1re5re4dh = $.trim($('td[n="evAllaih5n1re5re4dh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evAllaih5n1re5re4dh"]').text()));
            var evAllaih5n1re5re4x = $.trim($('td[n="evAllaih5n1re5re4x"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evAllaih5n1re5re4x"]').text()));
            var evAih5h9dh = $.trim($('td[n="evAih5h9dh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evAih5h9dh"]').text()));
            var evAih5h9x = $.trim($('td[n="evAih5h9x"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evAih5h9x"]').text()));
            var lj_evAllaih5n1re5re4dh = document.getElementById('evAllaih5n1re5re4dh').value;
            var lj_evAllaih5n1re5re4x = document.getElementById('evAllaih5n1re5re4x').value;
            var lj_evAih5h9dh = document.getElementById('evAih5h9dh').value;
            var lj_evAih5h9x = document.getElementById('evAih5h9x').value;
            $("td[role=lj_evAllaih5n1re5re4dh]").text((parseFloat(lj_evAllaih5n1re5re4dh) + parseFloat(evAllaih5n1re5re4dh)).toFixed(2));
            $("td[role=lj_evAllaih5n1re5re4x]").text((parseFloat(lj_evAllaih5n1re5re4x) + parseFloat(evAllaih5n1re5re4x)).toFixed(2));
            $("td[role=lj_evAih5h9dh]").text((parseFloat(lj_evAih5h9dh) + parseFloat(evAih5h9dh)).toFixed(2));
            $("td[role=lj_evAih5h9x]").text((parseFloat(lj_evAih5h9x) + parseFloat(evAih5h9x)).toFixed(2));
            var evPdprdh = $.trim($('td[n="evPdprdh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evPdprdh"]').text()));
            var evPdprx = $.trim($('td[n="evPdprx"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evPdprx"]').text()));
            var lj_evPdprdh = document.getElementById('evPdprdh').value;
            var lj_evPdprx = document.getElementById('evPdprx').value;
            $("td[role=lj_evPdprdh]").text((parseFloat(lj_evPdprdh) + parseFloat(evPdprdh)).toFixed(2));
            $("td[role=lj_evPdprx]").text((parseFloat(lj_evPdprx) + parseFloat(evPdprx)).toFixed(2));

            var evBrucellam5dh = $.trim($('td[n="evBrucellam5dh"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evBrucellam5dh"]').text()));
            var evBrucellam5x = $.trim($('td[n="evBrucellam5x"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="evBrucellam5x"]').text()));
            var lj_evBrucellam5dh = document.getElementById('evBrucellam5dh').value;
            var lj_evBrucellam5x = document.getElementById('evBrucellam5x').value;
            $("td[role=lj_evBrucellam5dh]").text((parseFloat(lj_evBrucellam5dh) + parseFloat(evBrucellam5dh)).toFixed(2));
            $("td[role=lj_evBrucellam5x]").text((parseFloat(lj_evBrucellam5x) + parseFloat(evBrucellam5x)).toFixed(2));


        }

        calculate()
    })(jQuery, window, document)
</script>
</#if>
