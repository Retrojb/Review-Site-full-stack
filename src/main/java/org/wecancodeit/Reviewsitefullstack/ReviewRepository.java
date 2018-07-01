package org.wecancodeit.Reviewsitefullstack;

import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review, Long> {


	Review findByTitle(String title);


}
