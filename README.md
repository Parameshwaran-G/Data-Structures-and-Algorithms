# Subarray Sum Equals K

**Difficulty:** Medium

**Concepts:** Prefix Sum + HashMap

**Language:** Java

## Approach

My idea is to remember previously calculated prefix sums and their frequencies using a HashMap.

Instead of calculating the sum of every possible subarray, I use this formula:

```text
Required Prefix = Current Prefix Sum - K
```

If the required prefix exists in my HashMap, its frequency tells me how many valid subarrays end at the current index.

## Why HashMap?

I store:

```text
Prefix Sum → Frequency
```

I use frequency because the same prefix sum can occur multiple times, and each occurrence can represent a different valid subarray.

## Important Points

1. Initialize HashMap with `{0 = 1}`.
2. Calculate the current prefix sum.
3. Find `currentPrefixSum - k`.
4. Add its frequency to the answer.
5. Store the current prefix sum in the HashMap.

**Important:** Search before inserting the current prefix sum.

## My Debugging Experience

Initially, I made two mistakes:

- I inserted the current prefix sum before checking the required prefix sum.
- I inserted the required prefix sum instead of the current prefix sum.

After debugging, I understood the correct order of operations.

## Complexity

- Time: O(n) average
- Space: O(n)

## What I Learned

- How Prefix Sum helps avoid repeatedly calculating subarray sums.
- How HashMap stores previous prefix sums.
- Why frequency is important when counting subarrays.
- How to recognize the Prefix Sum + HashMap pattern in DSA problems.
