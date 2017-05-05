xterm -title "RunDist" -e "java ExperimentController run-suite 50000 2531 730 output_5_dist.csv" &
xterm -title "GreenSuite" -e "sleep 1; java ExperimentController green-suite 5000 2531 365 output_5_green.csv 200 1" &
xterm -title "CarveSuite" -e "sleep 2; java ExperimentController carve-suite 5000 2531 365 output_5_carve.csv 00 200 1" &
xterm -title "OddsSuite" -e "sleep 3; java ExperimentController odds-suite 5000 2531 365 output_5_odds.csv single 200 1" &
xterm -title "Demo" -e "sleep 4; java ExperimentController demo"



