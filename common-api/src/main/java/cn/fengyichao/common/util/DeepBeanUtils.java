package cn.fengyichao.common.util;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class DeepBeanUtils extends BeanUtils {

    private DeepBeanUtils(){}

    /**
     * 实现List集合对象的拷贝处理
     * @param sources 源对象集合
     * @param target 目标对象集合
     * @param <S> 源对象类型
     * @param <T> 目标对象类型
     * @return
     */
    public static <S, T> List<T> copyListProperties(List<S> sources, Supplier<T> target){
        List<T> list = new ArrayList<>(sources.size());
        for (S source : sources){
            T obj = target.get();
            copyProperties(source, obj);
            list.add(obj);
        }
        return list;
    }

}
