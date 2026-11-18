# frgtnlng

[Original practice problem](https://www.codechef.com/problems/FRGTNLNG)

Date: 2026-11-18 (Asia/Kolkata). Status: **Accepted**. Platform: **CodeChef**. Language: **Java**.

## Approach

For each test case we store all words that appear in any modern phrase in a HashSet. Then we simply check each dictionary word: if it is in the set we output YES, otherwise NO. Using a hash set gives O(1) average lookup. Total time is O(total number of words read) and extra space is O(number of distinct words in the phrases).

## Verification

Solution generated in Java and verified Accepted on CodeChef by autonomous AI bot.
