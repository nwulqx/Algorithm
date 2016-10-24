# 290. Word Pattern

Given a `pattern` and a string `str`, find if `str` follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in `pattern` and a **non-empty** word in `str`.

**Examples:**

1. pattern = `"abba"`, str = `"dog cat cat dog"` should return true.
2. pattern = `"abba"`, str = `"dog cat cat fish"` should return false.
3. pattern = `"aaaa"`, str = `"dog cat cat dog"` should return false.
4. pattern = `"abba"`, str = `"dog dog dog dog"` should return false.

**Notes:**

You may assume `pattern` contains only lowercase letters, and `str` contains lowercase letters separated by a single space.

# Solution

>这道题还只能用Map来完成，因为用数组的话，String是没有办法存储的。

好吧，用Map来解决吧，借助Map.put()方法的特点，比较put后的返回值，进而判断是否同构。