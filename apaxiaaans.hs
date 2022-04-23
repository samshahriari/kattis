solve :: String -> String
solve [] = []
solve [x] = [x]
solve (x:y:xs)
    | x == y = solve( x:xs)
    | otherwise = x : solve (y:xs)

main = do
    input <- getLine 
    putStrLn (solve input)