package racingcar;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ResultView {
	private static final Logger log = LoggerFactory.getLogger(ResultView.class);
	
	public void printCar(Cars cars) {
		for (int i = 0; i < cars.getCars().size(); i++)
			log.info("{} : {}",cars.getCar(i).getName(),addDash(cars.getCar(i).getPosition()));
	}

	private String addDash(int pos) {
		StringBuilder sb = new StringBuilder("-");
		while (pos > 1) {
			sb.append("-");
			pos -= 1;
		}

		return sb.toString();
	}

	public void printWinner(ArrayList<String> winners) {
		for (String winner : winners) 
			log.info(winner + ": 가 최종 우승하셨습니다");
	}

	public void printResult(Cars carIns) {
		printCar(carIns);
		printWinner(carIns.compareWinner(carIns.findMaxScore()));
	}
}
