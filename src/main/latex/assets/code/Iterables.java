class Iterables {
public static boolean contains(Iterable<?> iterable,
                               Object element) {
    if (iterable instanceof Collection) {
        Collection<?> collection = (Collection<?>) iterable;
        return Collections2.safeContains(collection, element);
    }
    return Iterators.contains(iterable.iterator(), element);
}
}