library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity full_subtractor is
    Port ( A     : in  STD_LOGIC;  -- Minuend
           B     : in  STD_LOGIC;  -- Subtrahend
           Bin   : in  STD_LOGIC;  -- Borrow input
           Diff  : out STD_LOGIC;  -- Difference output
           Bout  : out STD_LOGIC   -- Borrow output
           );
end full_subtractor;

architecture Behavioral of full_subtractor is
begin
    -- Difference calculation
    Diff <= A XOR B XOR Bin;

    -- Borrow calculation
    Bout <= (NOT A AND (B OR Bin)) OR (B AND Bin);

end Behavioral;
