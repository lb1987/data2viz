/*
 * Copyright (c) 2018-2019. data2viz sàrl.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package io.data2viz.timeFormat

data class TimeLocale(
        val dateTime: String,
        val date: String,
        val time: String,
        val periods: List<String>,
        val days: List<String>,
        val shortDays: List<String>,
        val months: List<String>,
        val shortMonths: List<String>
)

class Locales {
    companion object {
        fun locale(
                dateTime: String = "%x, %X",
                date: String = "%-m/%-d/%Y",
                time: String = "%-I:%M:%S %p",
                periods: List<String> = listOf("AM", "PM"),
                days: List<String> = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"),
                shortDays: List<String> = listOf("Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"),
                months: List<String> = listOf("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
                shortMonths: List<String> = listOf("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec")
        ) = TimeLocale(dateTime, date, time, periods, days, shortDays, months, shortMonths)

        fun defaultLocale() = locale()
        fun ca_ES() = locale("%A, %e de %B de %Y, %X",
                "%d/%m/%Y",
                "%H:%M:%S",
                listOf("AM", "PM"),
                listOf("diumenge", "dilluns", "dimarts", "dimecres", "dijous", "divendres", "dissabte"),
                listOf("dg.", "dl.", "dt.", "dc.", "dj.", "dv.", "ds."),
                listOf("gener", "febrer", "març", "abril", "maig", "juny", "juliol", "agost", "setembre", "octubre", "novembre", "desembre"),
                listOf("gen.", "febr.", "març", "abr.", "maig", "juny", "jul.", "ag.", "set.", "oct.", "nov.", "des.")
        )

        fun cs_CZ() = locale("%A,%e.%B %Y, %X",
                "%-d.%-m.%Y",
                "%H:%M:%S",
                listOf("AM", "PM"),
                listOf("neděle", "pondělí", "úterý", "středa", "čvrtek", "pátek", "sobota"),
                listOf("ne.", "po.", "út.", "st.", "čt.", "pá.", "so."),
                listOf("leden", "únor", "březen", "duben", "květen", "červen", "červenec", "srpen", "září", "říjen", "listopad", "prosinec"),
                listOf("led", "úno", "břez", "dub", "kvě", "čer", "červ", "srp", "zář", "říj", "list", "pros")
        )

        fun de_CH() = locale("%A, der %e. %B %Y, %X",
                "%d.%m.%Y",
                "%H:%M:%S",
                listOf("AM", "PM"),
                listOf("Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"),
                listOf("So", "Mo", "Di", "Mi", "Do", "Fr", "Sa"),
                listOf("Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"),
                listOf("Jan", "Feb", "Mrz", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez")
        )

        fun de_DE() = locale("%A, der %e. %B %Y, %X",
                "%d.%m.%Y",
                "%H:%M:%S",
                listOf("AM", "PM"),
                listOf("Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"),
                listOf("So", "Mo", "Di", "Mi", "Do", "Fr", "Sa"),
                listOf("Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"),
                listOf("Jan", "Feb", "Mrz", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez")
        )

        fun en_CA() = locale("%a %b %e %X %Y",
                "%Y-%m-%d",
                "%H:%M:%S",
                listOf("AM", "PM"),
                listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"),
                listOf("Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"),
                listOf("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
                listOf("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec")
        )

        fun en_GB() = locale("%a %e %b %X %Y",
                "%d/%m/%Y",
                "%H:%M:%S",
                listOf("AM", "PM"),
                listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"),
                listOf("Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"),
                listOf("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
                listOf("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec")
        )

        fun en_US() = locale("%x, %X",
                "%-m/%-d/%Y",
                "%-I:%M:%S %p",
                listOf("AM", "PM"),
                listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"),
                listOf("Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"),
                listOf("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
                listOf("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec")
        )

        fun es_ES() = locale("%A, %e de %B de %Y, %X",
                "%d/%m/%Y",
                "%H:%M:%S",
                listOf("AM", "PM"),
                listOf("domingo", "lunes", "martes", "miércoles", "jueves", "viernes", "sábado"),
                listOf("dom", "lun", "mar", "mié", "jue", "vie", "sáb"),
                listOf("enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"),
                listOf("ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic")
        )

        fun es_MX() = locale("%x, %X",
                "%d/%m/%Y",
                "%-I:%M:%S %p",
                listOf("AM", "PM"),
                listOf("domingo", "lunes", "martes", "miércoles", "jueves", "viernes", "sábado"),
                listOf("dom", "lun", "mar", "mié", "jue", "vie", "sáb"),
                listOf("enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"),
                listOf("ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic")
        )

        fun fi_FI() = locale("%A, %-d. %Bta %Y klo %X",
                "%-d.%-m.%Y",
                "%H:%M:%S",
                listOf("a.m.", "p.m."),
                listOf("sunnuntai", "maanantai", "tiistai", "keskiviikko", "torstai", "perjantai", "lauantai"),
                listOf("Su", "Ma", "Ti", "Ke", "To", "Pe", "La"),
                listOf("tammikuu", "helmikuu", "maaliskuu", "huhtikuu", "toukokuu", "kesäkuu", "heinäkuu", "elokuu", "syyskuu", "lokakuu", "marraskuu", "joulukuu"),
                listOf("Tammi", "Helmi", "Maalis", "Huhti", "Touko", "Kesä", "Heinä", "Elo", "Syys", "Loka", "Marras", "Joulu")
        )

        fun fr_CA() = locale("%a %e %b %Y %X",
                "%Y-%m-%d",
                "%H:%M:%S",
                listOf("", ""),
                listOf("dimanche", "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi"),
                listOf("dim", "lun", "mar", "mer", "jeu", "ven", "sam"),
                listOf("janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "octobre", "novembre", "décembre"),
                listOf("jan", "fév", "mar", "avr", "mai", "jui", "jul", "aoû", "sep", "oct", "nov", "déc")
        )

        fun fr_FR() = locale("%A, le %e %B %Y, %X",
                "%d/%m/%Y",
                "%H:%M:%S",
                listOf("AM", "PM"),
                listOf("dimanche", "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi"),
                listOf("dim.", "lun.", "mar.", "mer.", "jeu.", "ven.", "sam."),
                listOf("janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "octobre", "novembre", "décembre"),
                listOf("janv.", "févr.", "mars", "avr.", "mai", "juin", "juil.", "août", "sept.", "oct.", "nov.", "déc.")
        )

        fun he_IL() = locale("%A, %e ב%B %Y %X",
                "%d.%m.%Y",
                "%H:%M:%S",
                listOf("AM", "PM"),
                listOf("ראשון", "שני", "שלישי", "רביעי", "חמישי", "שישי", "שבת"),
                listOf("א׳", "ב׳", "ג׳", "ד׳", "ה׳", "ו׳", "ש׳"),
                listOf("ינואר", "פברואר", "מרץ", "אפריל", "מאי", "יוני", "יולי", "אוגוסט", "ספטמבר", "אוקטובר", "נובמבר", "דצמבר"),
                listOf("ינו׳", "פבר׳", "מרץ", "אפר׳", "מאי", "יוני", "יולי", "אוג׳", "ספט׳", "אוק׳", "נוב׳", "דצמ׳")
        )

        fun hu_HU() = locale("%Y. %B %-e., %A %X",
                "%Y. %m. %d.",
                "%H:%M:%S",
                listOf("de.", "du."),
                listOf("vasárnap", "hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat"),
                listOf("V", "H", "K", "Sze", "Cs", "P", "Szo"),
                listOf("január", "február", "március", "április", "május", "június", "július", "augusztus", "szeptember", "október", "november", "december"),
                listOf("jan.", "feb.", "már.", "ápr.", "máj.", "jún.", "júl.", "aug.", "szept.", "okt.", "nov.", "dec.")
        )

        fun it_IT() = locale("%A %e %B %Y, %X",
                "%d/%m/%Y",
                "%H:%M:%S",
                listOf("AM", "PM"),
                listOf("Domenica", "Lunedì", "Martedì", "Mercoledì", "Giovedì", "Venerdì", "Sabato"),
                listOf("Dom", "Lun", "Mar", "Mer", "Gio", "Ven", "Sab"),
                listOf("Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"),
                listOf("Gen", "Feb", "Mar", "Apr", "Mag", "Giu", "Lug", "Ago", "Set", "Ott", "Nov", "Dic")
        )

        fun ja_JP() = locale("%Y %b %e %a %X",
                "%Y/%m/%d",
                "%H:%M:%S",
                listOf("AM", "PM"),
                listOf("日曜日", "月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日"),
                listOf("日", "月", "火", "水", "木", "金", "土"),
                listOf("睦月", "如月", "弥生", "卯月", "皐月", "水無月", "文月", "葉月", "長月", "神無月", "霜月", "師走"),
                listOf("1月", "2月", "3月", "4月", "5月", "6月", "7月", "8月", "9月", "10月", "11月", "12月")
        )

        fun ko_KR() = locale("%Y/%m/%d %a %X",
                "%Y/%m/%d",
                "%H:%M:%S",
                listOf("오전", "오후"),
                listOf("일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"),
                listOf("일", "월", "화", "수", "목", "금", "토"),
                listOf("1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"),
                listOf("1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월")
        )

        fun mk_MK() = locale("%A, %e %B %Y г. %X",
                "%d.%m.%Y",
                "%H:%M:%S",
                listOf("AM", "PM"),
                listOf("недела", "понеделник", "вторник", "среда", "четврток", "петок", "сабота"),
                listOf("нед", "пон", "вто", "сре", "чет", "пет", "саб"),
                listOf("јануари", "февруари", "март", "април", "мај", "јуни", "јули", "август", "септември", "октомври", "ноември", "декември"),
                listOf("јан", "фев", "мар", "апр", "мај", "јун", "јул", "авг", "сеп", "окт", "ное", "дек")
        )

        fun nl_NL() = locale("%a %e %B %Y %T",
                "%d-%m-%Y",
                "%H:%M:%S",
                listOf("AM", "PM"),
                listOf("zondag", "maandag", "dinsdag", "woensdag", "donderdag", "vrijdag", "zaterdag"),
                listOf("zo", "ma", "di", "wo", "do", "vr", "za"),
                listOf("januari", "februari", "maart", "april", "mei", "juni", "juli", "augustus", "september", "oktober", "november", "december"),
                listOf("jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec")
        )

        fun pl_PL() = locale("%A, %e %B %Y, %X",
                "%d/%m/%Y",
                "%H:%M:%S",
                listOf("AM", "PM"),
                listOf("Niedziela", "Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota"),
                listOf("Niedz.", "Pon.", "Wt.", "Śr.", "Czw.", "Pt.", "Sob."),
                listOf("Styczeń", "Luty", "Marzec", "Kwiecień", "Maj", "Czerwiec", "Lipiec", "Sierpień", "Wrzesień", "Październik", "Listopad", "Grudzień"),
                listOf("Stycz.", "Luty", "Marz.", "Kwie.", "Maj", "Czerw.", "Lipc.", "Sierp.", "Wrz.", "Paźdz.", "Listop.", "Grudz.")
        )

        fun pt_BR() = locale("%A, %e de %B de %Y. %X",
                "%d/%m/%Y",
                "%H:%M:%S",
                listOf("AM", "PM"),
                listOf("Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"),
                listOf("Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sáb"),
                listOf("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"),
                listOf("Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez")
        )

        fun ru_RU() = locale("%A, %e %B %Y г. %X",
                "%d.%m.%Y",
                "%H:%M:%S",
                listOf("AM", "PM"),
                listOf("воскресенье", "понедельник", "вторник", "среда", "четверг", "пятница", "суббота"),
                listOf("вс", "пн", "вт", "ср", "чт", "пт", "сб"),
                listOf("января", "февраля", "марта", "апреля", "мая", "июня", "июля", "августа", "сентября", "октября", "ноября", "декабря"),
                listOf("янв", "фев", "мар", "апр", "май", "июн", "июл", "авг", "сен", "окт", "ноя", "дек")
        )

        fun sv_SE() = locale("%A den %d %B %Y %X",
                "%Y-%m-%d",
                "%H:%M:%S",
                listOf("fm", "em"),
                listOf("Söndag", "Måndag", "Tisdag", "Onsdag", "Torsdag", "Fredag", "Lördag"),
                listOf("Sön", "Mån", "Tis", "Ons", "Tor", "Fre", "Lör"),
                listOf("Januari", "Februari", "Mars", "April", "Maj", "Juni", "Juli", "Augusti", "September", "Oktober", "November", "December"),
                listOf("Jan", "Feb", "Mar", "Apr", "Maj", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dec")
        )

        fun uk_UA() = locale("%A, %e %B %Y р. %X",
                "%d.%m.%Y",
                "%H:%M:%S",
                listOf("дп", "пп"),
                listOf("неділя", "понеділок", "вівторок", "середа", "четвер", "п'ятниця", "субота"),
                listOf("нд", "пн", "вт", "ср", "чт", "пт", "сб"),
                listOf("січня", "лютого", "березня", "квітня", "травня", "червня", "липня", "серпня", "вересня", "жовтня", "листопада", "грудня"),
                listOf("січ.", "лют.", "бер.", "квіт.", "трав.", "черв.", "лип.", "серп.", "вер.", "жовт.", "лист.", "груд.")
        )

        fun zh_CN() = locale("%x %A %X",
                "%Y年%-m月%-d日",
                "%H:%M:%S",
                listOf("上午", "下午"),
                listOf("星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"),
                listOf("周日", "周一", "周二", "周三", "周四", "周五", "周六"),
                listOf("一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"),
                listOf("一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月")
        )
    }
}
