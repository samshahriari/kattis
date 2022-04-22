import Data.List
import GHC.Read (readNumber)
solve [l, w , h] = 4 * maximum [(w*h),(l-w)*h,w*(l-h),(l-w)*(l-h)]

inputList :: String -> [Integer]
inputList st =  map read $ words st

main = do
    input <- getLine
    putStrLn (show ( solve (inputList input)))
    -- putStrLn input