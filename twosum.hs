solve [a,b] = a+b

inputList :: String -> [Integer]
inputList st =  map read $ words st

main = do
    input <- getLine 
    putStrLn (show ( solve (inputList input)))