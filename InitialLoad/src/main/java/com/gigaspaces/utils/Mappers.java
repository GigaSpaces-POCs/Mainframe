package com.gigaspaces.utils;

import com.gigaspaces.interfaces.*;

import java.sql.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Denys_Novikov
 * Date: 14.09.2018
 */
public class Mappers {

    public static <T extends HasAban> Map<String, List<T>> mapByAban(List<T> inputList) {
        return inputList.stream().collect(Collectors.groupingBy(HasAban::getAban));
    }

    public static <T extends HasBillDate> Map<Date, List<T>> mapByBillDate(List<T> inputList) {
        return inputList.stream().collect(Collectors.groupingBy(HasBillDate::getBillDate));
    }

    public static <T extends HasBan> Map<String, List<T>> mapByBan(List<T> inputList) {
        return inputList.stream().collect(Collectors.groupingBy(HasBan::getBan));
    }

    public static <T extends HasOrigSystemId> Map<String, List<T>> mapByOrigSystemId(List<T> inputList) {
        return inputList.stream().collect(Collectors.groupingBy(HasOrigSystemId::getOrigSystemId));
    }

    public static <T extends HasManBillDate> Map<Date, List<T>> mapByManBillDate(List<T> inputList) {
        return inputList.stream().collect(Collectors.groupingBy(HasManBillDate::getManBillDate));
    }

    public static <T extends HasMan> Map<String, List<T>> mapByMan(List<T> inputList) {
        return inputList.stream().collect(Collectors.groupingBy(HasMan::getMan));
    }

}
