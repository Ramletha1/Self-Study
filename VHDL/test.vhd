library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity Full_Subtractor is
    port (
        a, b, c_in : in std_logic;
        s, c_out   : out std_logic
    );
end Full_Subtractor;

architecture BEHAVIOR of Full_Subtractor is
    component Half_Adder is
        port (
            a, b : in std_logic;
            s,c  : out std_logic
        );
    end component;

    signal S1, S2, C1, C2, b1, C0 : std_logic;

begin
    b1 <= not b;
    C0 <= c_in or not c_in;

    ha1: Half_Adder port map (a, b1, S1, C1);
    ha2: Half_Adder port map (S1, C0, S2, C2);

    s <= S2;
    c_out <= C1 or C2;
end BEHAVIOR;


entity Half_Adder is
    port (
        a, b, cin : in std_logic;
        s, c_out  : out std_logic
    );
end Half_Adder;

architecture BEHAVIOR of Half_Adder is
begin
    s <= a XOR b;
    c <= a AND b;
end BEHAVIOR;