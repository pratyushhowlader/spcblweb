/* Custom filtering function which will search data in column four between two values */
/*$.fn.dataTable.ext.search.push(
    function(settings, data, dataIndex) {

        if ( settings.nTable.id !== 'dailyReport' ) {
            return true;
        }

        var from = moment($('#from_date').val(), "DD/MM/YYYY");
        var to = moment($('#to_date').val(), "DD/MM/YYYY");
        var date = moment(data[4], "DD/MM/YYYY");

        if( (!from.isValid() && !to.isValid()) ||
            (!from.isValid() && date.isSameOrBefore(to) ) ||
            (date.isSameOrAfter(from) && !to.isValid()) ||
            (date.isSameOrAfter(from) && date.isSameOrBefore(to)) )  {
            return true;
        }

        return false;
    }
);*/
/*
$.fn.dataTableExt.afnFiltering.push(
    function(oSettings, aData, iDataIndex) {
        var iFini = ~~moment($('#from_date').val(), "DD/MM/YYYY").format("X");
        var iFfin = ~~moment($('#to_date').val(), "DD/MM/YYYY").format("X");
        var evalDate = ~~moment(aData[4], "YYYY/MM/DD").format("X");
        if (evalDate >= iFini && evalDate <= iFfin) {
            return true;
        } else {
            return false;
        }
    }
);
*/
