package com.javarush.test.level17.lesson10.home01;

import java.util.*;

/* Общий список
1. Изменить класс Solution так, чтобы он стал списком. (Необходимо реализовать интерфейс java.util.List).
2. Список Solution должен работать только с целыми числами Long.
3. Воспользуйтесь полем original.
4. Список будет использоваться нитями, поэтому позаботьтесь, чтобы все методы были синхронизированы.
*/

public class Solution implements List {
    private ArrayList<Long> original = new ArrayList<Long>();
    public void trimToSize()
    {
        original.trimToSize();
    }

    @Override
    public boolean contains(Object o)
    {
        return original.contains((Long) o);
    }

    @Override
    public Long[] toArray(Object[] a)
    {
        return (Long[]) original.toArray(a);
    }

    @Override
    public boolean add(Object o)
    {
        return original.add((Long) o);
    }

    @Override
    public boolean remove(Object o)
    {
        return original.remove((Long)o);
    }

    @Override
    public boolean containsAll(Collection c)
    {
        return original.containsAll(c);
    }

    @Override
    public boolean addAll(Collection c)
    {
        return original.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection c)
    {
        return original.addAll(index, c);
    }

    @Override
    public boolean removeAll(Collection c)
    {
        return original.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection c)
    {
        return original.retainAll(c);
    }

    @Override
    public Long set(int index, Object element)
    {
        return original.set(index, (Long) element);
    }

    @Override
    public void add(int index, Object element)
    {
        original.add(index, (Long) element);
    }

    @Override
    public int indexOf(Object o)
    {
        return original.indexOf((Long) o);
    }

    @Override
    public int lastIndexOf(Object o)
    {
        return original.lastIndexOf((Long) o);
    }

    public boolean add(Long aLong)
    {
        return original.add(aLong);
    }

    public Long[] toArray()
    {
        return (Long[])original.toArray();
    }

    public boolean contains(Long o)
    {
        return original.contains(o);
    }

    public void add(int index, Long element)
    {
        original.add(index, element);
    }

    public Long set(int index, Long element)
    {
        return original.set(index, element);
    }

    public void clear()
    {
        original.clear();
    }

    public void ensureCapacity(int minCapacity)
    {
        original.ensureCapacity(minCapacity);
    }

    public List<Long> subList(int fromIndex, int toIndex)
    {
        return original.subList(fromIndex, toIndex);
    }

    public int indexOf(Long o)
    {
        return original.indexOf(o);
    }

    public boolean isEmpty()
    {
        return original.isEmpty();
    }

    public int lastIndexOf(Long o)
    {
        return original.lastIndexOf(o);
    }

    public Long get(int index)
    {
        return original.get(index);
    }

    public ListIterator<Long> listIterator()
    {
        return original.listIterator();
    }

    public int size()
    {
        return original.size();
    }

    public ListIterator<Long> listIterator(int index)
    {
        return original.listIterator(index);
    }

    public boolean remove(Long o)
    {
        return original.remove(o);
    }

    public Long remove(int index)
    {
        return original.remove(index);
    }

    public Iterator<Long> iterator()
    {
        return original.iterator();
    }

}