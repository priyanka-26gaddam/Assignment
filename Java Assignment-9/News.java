import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class News {
	int newsid;
	String postedByUser;
	String commentByUser;
	String comment;
	public News(int newsid,
	String postedByUser,
	String commentByUser,
	String comment) {
	this.newsid=newsid;
	this.postedByUser=postedByUser;
	this.commentByUser=commentByUser;
	this.comment=comment;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<News>list=new ArrayList<News>();
		list.add(new News(123,"priya","hi","message"));
		list.add(new News(124,"chinni","hello","how are you?"));
		list.add(new News(122,"jillu","hi","I'm fine"));
		list.add(new News(125,"mani","hey","good evening"));
		list.add(new News(126,"madhu","hey"," "));
		/*Stream<News> filtereddata=list.stream().filter(N->N.newsid==1);
		filtereddata.forEach
		(
				News ->{
					System.out.println(News.newsid);
					}
				);*/
		Stream<News> filtereddata=list.stream().filter(N->N.commentByUser=="India has poorbudget this year");
		filtereddata.forEach
		(
				News ->{
					System.out.println(News.commentByUser);
					}
						);
	}

}
