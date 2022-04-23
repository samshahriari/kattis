solve all@('a':xs) = all
solve (x:xs) = solve xs


 

main = do
    input <- getLine
    putStrLn( solve input)