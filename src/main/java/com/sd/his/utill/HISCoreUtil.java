package com.sd.his.utill;


import com.sd.his.model.Branch;
import com.sd.his.wrapper.response.BranchResponseWrapper;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Predicate;

        /*
         * @author    : irfan
         * @Date      : 16-Apr-18
         * @version   : ver. 1.0.0
         *
         * ________________________________________________________________________________________________
         *
         *  Developer				Date		     Version		Operation		Description
         * ________________________________________________________________________________________________
         *
         *
         * ________________________________________________________________________________________________
         *
         * @Project   : HIS
         * @Package   : com.sd.ap.util
         * @FileName  : HISCoreUtil
         *
         * Copyright ©
         * SolutionDots,
         * All rights reserved.
         *
         */

public class HISCoreUtil {

    public static boolean isNull(String checkString) {
        if (null == checkString || checkString.trim().length() == 0 || checkString.trim().equalsIgnoreCase("null")) {
            return true;
        }
        return false;
    }

    public static boolean isValidObject(Object object) {
        if (null != object) {
            return true;
        }
        return false;
    }

    public static boolean isListEmpty(List<?> dataList) {
        if (null == dataList || dataList.isEmpty()) {
            return true;
        }
        return false;
    }

    /***
     * Valid mean , not null and not empty the list
     *
     *
     */
    public static boolean isListValid(List<?> dataList) {
        if (null == dataList || dataList.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean isMapEmpty(Map<?, ?> dataMap) {
        if (null == dataMap || dataMap.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isSetEmpty(Set<?> dataSet) {
        if (null == dataSet || dataSet.isEmpty()) {
            return true;
        }
        return false;
    }

    public static long convertDateToMilliSeconds(String myDate) {
        //= "2014/10/29 18:10:45";
        if (myDate != null) {
            Instant instant = Instant.parse(myDate);

            return instant.toEpochMilli();
        } else {
            return 0;
        }
    }

    public static Date convertToTime(String str) {
        Date date = null;
        if (str != null) {
            SimpleDateFormat formatter = new SimpleDateFormat(HISConstants.TIME_FORMAT_PATTERN);
            try {
                date = formatter.parse(str);
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
        return date;
    }

    public static String convertTimeToString(Date time) {
        String formatedDate = null;
        if (time != null) {
            SimpleDateFormat form = new SimpleDateFormat("hh:mm:ss");
            formatedDate = form.format(time);
        }
        return formatedDate;
    }

    public static String convertDateToString(Date date) {
        String formatedDate = null;
        if (date != null) {
            SimpleDateFormat form = new SimpleDateFormat("dd MMMM yyyy");
            formatedDate = form.format(date);
        }
        return formatedDate;
    }

    public static String convertDateToString(Date date,String formate) {
        String formatedDate = null;
        if (date != null) {
            SimpleDateFormat form = new SimpleDateFormat(formate);
            formatedDate = form.format(date);
        }
        return formatedDate;
    }

    public static Date convertToDate(String str) {
        Date date = null;
        if (str != null) {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
            try {
                date = formatter.parse(str);
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
        return date;
    }

    public static Date convertToDateWithTime(String strDate, String formateDate) {
        Date date = null;
        if (strDate != null) {
            SimpleDateFormat formatter = new SimpleDateFormat(formateDate);///*"yyyy-MM-dd'T'HH:mm"*/
            try {
                date = formatter.parse(strDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
        return date;
    }


    public static Date addTimetoDate(Date str, long duration) {
        Date date = null;
        if (str != null) {
            date = Date.from(str.toInstant().plusSeconds(duration * 60));
        }
        return date;
    }

    public static String convertDateToStringWithZone(Date date) {
        String formatedDate = null;
        if (date != null) {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
            formatedDate = formatter.format(date);
            //date = formatter.parse(str);
        }
        return formatedDate;
    }

    public static String convertDateAndTimeToString(Date date) {
        String formatedDate = null;
        if (date != null) {
            SimpleDateFormat form = new SimpleDateFormat("dd MMMM yyyy : hh:mm:ss");
            formatedDate = form.format(date);
        }
        return formatedDate;
    }
    public static String convertDateAndTimeToStringWithPMAndAM(Date date) {
        String formatedDate = null;
        if (date != null) {
            SimpleDateFormat form = new SimpleDateFormat("dd MMMM yyyy : hh:mm:ss aa");
            formatedDate = form.format(date);
        }
        return formatedDate;
    }

    public static Predicate<BranchResponseWrapper> isExist(long id) {
        return p->(p.getId() ==id);
    }

    public static String  getCurrentDateWithZone(String ZoneName,String format){
        System.out.println("-----Current Date  of a  time zone using -----");
        ZoneId zoneId = ZoneId.of(ZoneName);
        LocalTime localTime=LocalTime.now(zoneId);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        String formattedTime=localTime.format(formatter);
        System.out.println("Current Date : " + formattedTime);
        return formattedTime;
    }


    public static String convertDateToTimeZone(Date date, String format,
                                               String timeZone) {

        if (date == null)
            return null;

        SimpleDateFormat sdf = new SimpleDateFormat(format);


        if (timeZone == null || "".equalsIgnoreCase(timeZone.trim())) {
            return null;
        }

        sdf.setTimeZone(java.util.TimeZone.getTimeZone(timeZone));


                return  sdf.format(date);

            //    return

    }


    public static String  getCurrentTimeByzone(String tzName) {

        String currentTime="";

        if(isNull(tzName)){
            return null;
        }
        Calendar time = new GregorianCalendar(TimeZone.getTimeZone(tzName));
        time.setTimeInMillis(time.getTimeInMillis());
        int hour = time.get(Calendar.HOUR);
        int minute = time.get(Calendar.MINUTE);
        int second = time.get(Calendar.SECOND);
        int year = time.get(Calendar.YEAR);
        currentTime=hour+":"+minute+":"+second;
        return currentTime;
    }

    public static String formatDateToString(Date date, String format,
                                            String timeZone) {

        if (date == null)
            return null;

        SimpleDateFormat sdf = new SimpleDateFormat(format);

        if (timeZone == null || "".equalsIgnoreCase(timeZone.trim())) {
            return null;
        }

        sdf.setTimeZone(TimeZone.getTimeZone(timeZone));

        return sdf.format(date);
    }

    public static Date convertToDateZone(String str) {
        Date date = null;
        if (str != null) {

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            try {
                date = formatter.parse(str);
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
        return date;
    }


    public static String convertToTimeFormat(String str,String timeFormat) {

        LocalTime time = LocalTime.parse(str);
        System.out.println(time);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(timeFormat);
        System.out.println(formatter.format(time));
        return  formatter.format(time);
    }

    public static Date convertToAPPDate(String str) {
        Date date = null;
        if (str != null) {
            SimpleDateFormat formatter = new SimpleDateFormat(HISConstants.DATE_FORMAT_APP);
            try {
                date = formatter.parse(str);
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
        return date;
    }

    public static Date convertToAPPDateZone(String str,String format) {
        Date date = null;
        if (str != null) {
            SimpleDateFormat formatter = new SimpleDateFormat(format);
            try {
                date = formatter.parse(str);
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
        return date;
    }


    public static Date convertToDateString(String str,String format) {
        Date date = null;
        if (str != null) {
            SimpleDateFormat formatter = new SimpleDateFormat(format);
            try {
                date = formatter.parse(str);
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
        return date;
    }


    public static Date convertToDateNew(String str) {
        Date date = null;
        if (str != null) {
            SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
            try {
                date = formatter.parse(str);
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
        return date;
    }

    public static Date  convertStringDateObject(String dateinString) {

        Date dte = new Date();
        if (dateinString != null) {

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                dte = formatter.parse(dateinString);
            } catch (ParseException e) {
                e.printStackTrace();
            }


        }
        return dte;
    }

    public static Date convertToDateDetail(String str) {
        Date date = null;
        if (str != null) {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                date = formatter.parse(str);
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
        return date;
    }



    public static String convertDateToStringUpload(Date date) {
        String formatedDate = null;
        if (date != null) {
            SimpleDateFormat form = new SimpleDateFormat("ddMMMMyyyyhhss");
            formatedDate = form.format(date);
        }
        return formatedDate;
    }
}