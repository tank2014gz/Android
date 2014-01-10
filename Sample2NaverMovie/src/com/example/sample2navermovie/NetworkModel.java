package com.example.sample2navermovie;

public class NetworkModel {
	
	private static NetworkModel instance;
	
	public static NetworkModel getInstance() {
		if (instance == null) {
			instance = new NetworkModel();
		}
		return instance;
	}
	
	private void NetworkModel() {
		
	}
	
	public interface OnNetworkResultListener {
		public void onResultSuccess(NaverMovies movies);
		public void onResultFail(int errorCode);
	}
	
	public void getMovieData(String keyword, OnNetworkResultListener listener) {
		MovieListDownloadTask task = new MovieListDownloadTask();
		task.setOnNetworkResultListener(listener);
		task.execute(keyword);
	}
	
}